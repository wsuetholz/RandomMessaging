/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.api.MessageType;
import net.suetholz.messageing.exceptions.NullStringParameterException;

/**
 *
 * @author wsuetholz
 */
public class MessageStorageModel extends AbstractTableModel implements MessageStorage {

    private static final String[] columnNames = { "Message" };

    private List<MessageType> messageList;

    public MessageStorageModel ( ) {
	this.messageList = new ArrayList<>();
    }
    
    /**
     * Get the value of messageList
     *
     * @return the value of messageList
     */
    public final List<MessageType> getMessageList() {
	return messageList;
    }

    /**
     * Add a Message to the messageList
     *
     * @param message
     */
    @Override
    public final void addMessage(MessageType message) {
	// Note: 
	// Because in practice I believe that adding messages will happen
	// less frequently than producing a random message. The transformation
	// to a Set and back to a List will happen in this function.  That is 
	// a fairly costly operation, and still bears some additional thought
	// to tune things better....
	if (message == null) {
	    throw new NullStringParameterException();
	}

	messageList.add(message);
	messageList = new ArrayList<>(new LinkedHashSet<MessageType>(messageList)); // LinkedHashSet maintains order!!
	this.fireTableDataChanged();
    }

    @Override
    public final void removeMessage(MessageType message) {
	if (message == null) {
	    throw new NullStringParameterException();
	}

	messageList.remove(message);
	this.fireTableDataChanged();
    }

    @Override
    public final MessageType getMessage(int idx) {
	if (idx < 0 || (idx+1) > messageList.size()) {
	    throw new ArrayIndexOutOfBoundsException();
	}

	return messageList.get(idx);
    }

    @Override
    public final TableModel getTableModel() {
	return this;
    }

    @Override
    public final int length() {
	return messageList.size();
    }

    @Override
    public final int getRowCount() {
	return messageList.size();
    }

    @Override
    public final int getColumnCount() {
	return 1;
    }

    @Override
    public final Object getValueAt(int rowIndex, int columnIndex) {
	return messageList.get(rowIndex).toString();
    }

    @Override
    public final int hashCode() {
	int hash = 7;
	hash = 19 * hash + Objects.hashCode(this.messageList);
	return hash;
    }

    @Override
    public final boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final MessageStorageModel other = (MessageStorageModel) obj;
	if (!Objects.equals(this.messageList, other.messageList)) {
	    return false;
	}
	return true;
    }

    @Override
    public final String toString() {
	return "MessageStorageModel{" + "messageList=" + messageList + '}';
    }
    
}

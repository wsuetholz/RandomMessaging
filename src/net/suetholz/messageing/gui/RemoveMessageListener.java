/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageStorageChangedListener;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class RemoveMessageListener implements ActionListener {
    private static final String LISTENER_NULL = "Initial Listeners is NULL!";

    List<MessageStorageChangedListener> storageChangedListeners;

    public RemoveMessageListener(List<MessageStorageChangedListener> storageChangedListeners) {
	if (storageChangedListeners == null) {
	    throw new IllegalArgumentException(LISTENER_NULL);
	}
	this.storageChangedListeners = storageChangedListeners;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() instanceof JButton) {
	    JButton button = (JButton)e.getSource();
	    if (button.getParent() instanceof MessageProducer) {
		MessageProducer producer = (MessageProducer)button.getParent();
		MessageType message = producer.produceMessage();
		for (MessageStorageChangedListener changeListener : storageChangedListeners) {
		    changeListener.oldMessageRemoved(message);
		}
	    }
        }
    }
    
}

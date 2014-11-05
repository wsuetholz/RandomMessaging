/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageStorageChangedListener;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class SelectMessageListener implements ActionListener {

    MessageProducer selectMessage;

    /**
     * Creates new form SelectMessagePanel
     */
    public SelectMessageListener(MessageProducer selectMessage) {
	if (selectMessage == null) {
	    throw new IllegalArgumentException();
	}

	this.selectMessage = selectMessage;
    }

    @Override
    public final void actionPerformed(ActionEvent e) {
	if (e.getSource() instanceof JButton) {
	    JButton button = (JButton) e.getSource();
	    if (button.getParent() instanceof SelectMessagePanel) {
		SelectMessagePanel panel = (SelectMessagePanel) button.getParent();
		panel.setMessageText ( selectMessage.produceMessage().toString() );
	    }
	}

    }

}

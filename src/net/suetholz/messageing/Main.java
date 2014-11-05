/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.gui.MessagingGUI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.suetholz.messageing.api.MessageStorageChangedListener;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.generator.RandomMessageProducer;

/**
 *
 * @author wsuetholz
 */
public class Main {

    private static final String PROGRAM_FAULT = "I'm sorry, but something is misconfigured in the application!";

    public static void main(String[] args) {
	List<MessageStorageChangedListener> interestedParties = new ArrayList<>();
	MessageStorage messageStorage = new MessageStorageModel();
	MessageProducer messageProducer = new RandomMessageProducer(messageStorage);
	interestedParties.add(new StorageChangedListener(messageStorage));

	try {
	    // Set System L&F
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
		// do nothing, this can safely be ignored because
	    // it will fall back to the basic metal L&F if something
	    // goes wrong. This is also a rare example of a scenario
	    // where the catch clause could be safely eliminated.
	}

	final MessagingGUI messagingGui = new MessagingGUI(messageStorage, messageProducer, interestedParties);

	/* 
	 Create and display the form  on a separate thread using
	 JDK 7 or earlier syntax, which rquires an anonymous inner class
	 */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		messagingGui.setVisible(true);
    //                Window3 w3 = new Window3();
		//                w3.setVisible(true);
		//                new Window2(w3).setVisible(true);
	    }
	});
    }
}

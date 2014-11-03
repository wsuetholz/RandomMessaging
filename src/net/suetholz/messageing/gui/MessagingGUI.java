/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.gui;

import java.util.List;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.api.MessageStorageChangedListener;

/**
 *
 * @author wsuetholz
 */
public class MessagingGUI extends javax.swing.JFrame {
    private static final String MSGSTORAGE_NULL = "Message Storage Parameter is NULL!";
    private static final String MSGPRODUCER_NULL = "Message Producer Parameter is NULL!";
    private static final String LISTENER_NULL = "Initial Listeners is NULL!";

    MessageStorage messageStorage;
    MessageProducer messageProducer;
    List<MessageStorageChangedListener> initialListeners;
    
    /**
     * Creates new form MessagingGUI
     */
    public MessagingGUI(MessageStorage messageStorage, MessageProducer messageProducer, List<MessageStorageChangedListener> initialListeners) {
	if (messageStorage == null) {
	    throw new IllegalArgumentException(MSGSTORAGE_NULL);
	}
	if (messageProducer == null) {
	    throw new IllegalArgumentException(MSGPRODUCER_NULL);
	}
	if (initialListeners == null) {
	    throw new IllegalArgumentException(LISTENER_NULL);
	}
	
	this.messageStorage = messageStorage;
	this.messageProducer = messageProducer;
	this.initialListeners = initialListeners;
	
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblHeading = new javax.swing.JLabel();
        pnlMessages = new javax.swing.JScrollPane();
        tblMessages = new javax.swing.JTable();
        pnlAddressMessage = pnlAddressMessage = new net.suetholz.messageing.gui.AddressMessagePanel(initialListeners);
        ;
        pnlStringMessage = pnlStringMessage = new net.suetholz.messageing.gui.StringMessagePanel(initialListeners);
        ;
        selectMessagePanel1 = new net.suetholz.messageing.gui.SelectMessagePanel();
        mnuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuEdit = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Chancery Uralic", 1, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Random Message Selector");

        tblMessages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        pnlMessages.setViewportView(tblMessages);

        pnlAddressMessage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlStringMessage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectMessagePanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnuFile.setText("File");
        mnuBar.add(mnuFile);

        mnuEdit.setText("Edit");
        mnuBar.add(mnuEdit);

        mnuExit.setText("Exit");
        mnuExit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mnuExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnuBar.add(mnuExit);

        setJMenuBar(mnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlMessages))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAddressMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectMessagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlStringMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAddressMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlStringMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectMessagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuExit;
    private javax.swing.JMenu mnuFile;
    private net.suetholz.messageing.gui.AddressMessagePanel pnlAddressMessage;
    private javax.swing.JScrollPane pnlMessages;
    private net.suetholz.messageing.gui.StringMessagePanel pnlStringMessage;
    private net.suetholz.messageing.gui.SelectMessagePanel selectMessagePanel1;
    private javax.swing.JTable tblMessages;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.gui;

/**
 *
 * @author wsuetholz
 */
public class SelectMessagePanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectMessagePanel
     */
    public SelectMessagePanel() {
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

        lblSelected = new javax.swing.JLabel();
        btnSelectMessage = new javax.swing.JButton();
        pneSelectedMessage = new javax.swing.JScrollPane();
        txtSelectedMessage = new javax.swing.JTextArea();

        lblSelected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelected.setText("Selected Message");

        btnSelectMessage.addActionListener(new SelectMessageListener());
        btnSelectMessage.setText("Select Message");

        txtSelectedMessage.setColumns(20);
        txtSelectedMessage.setRows(5);
        pneSelectedMessage.setViewportView(txtSelectedMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pneSelectedMessage)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnSelectMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pneSelectedMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelected))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnSelectMessage)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectMessage;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JScrollPane pneSelectedMessage;
    private javax.swing.JTextArea txtSelectedMessage;
    // End of variables declaration//GEN-END:variables
}
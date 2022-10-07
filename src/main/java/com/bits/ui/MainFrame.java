/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bits.ui;

import javax.swing.JInternalFrame;

/**
 *
 * @author henock
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        setupMenu = new javax.swing.JMenu();
        unitMenuItem = new javax.swing.JMenuItem();
        pGroupMenuItem = new javax.swing.JMenuItem();
        productsMenuItem = new javax.swing.JMenuItem();
        transactionMenu = new javax.swing.JMenu();
        purchasesMenuItem = new javax.swing.JMenuItem();
        salesMenuItem = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management Application");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        setupMenu.setText("Setup");

        unitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.META_DOWN_MASK));
        unitMenuItem.setText("Units ...");
        unitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitMenuItemActionPerformed(evt);
            }
        });
        setupMenu.add(unitMenuItem);

        pGroupMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.META_DOWN_MASK));
        pGroupMenuItem.setText("Product Groups ...");
        pGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGroupMenuItemActionPerformed(evt);
            }
        });
        setupMenu.add(pGroupMenuItem);

        productsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.META_DOWN_MASK));
        productsMenuItem.setText("Products ...");
        setupMenu.add(productsMenuItem);

        jMenuBar1.add(setupMenu);

        transactionMenu.setText("Transaction");

        purchasesMenuItem.setText("Purchases ...");
        transactionMenu.add(purchasesMenuItem);

        salesMenuItem.setText("Sales ...");
        transactionMenu.add(salesMenuItem);

        jMenuBar1.add(transactionMenu);

        reportsMenu.setText("Reports");
        jMenuBar1.add(reportsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGroupMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pGroupMenuItemActionPerformed

    private void unitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitMenuItemActionPerformed
        JInternalFrame frame = new UnitInternalFrame();
        frame.setVisible(true);
        this.jDesktopPane1.add(frame);
    }//GEN-LAST:event_unitMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
                mainFrame.setExtendedState(mainFrame.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pGroupMenuItem;
    private javax.swing.JMenuItem productsMenuItem;
    private javax.swing.JMenuItem purchasesMenuItem;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JMenuItem salesMenuItem;
    private javax.swing.JMenu setupMenu;
    private javax.swing.JMenu transactionMenu;
    private javax.swing.JMenuItem unitMenuItem;
    // End of variables declaration//GEN-END:variables
}
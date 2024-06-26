/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bdt1;

import login.Jregister;
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.views.divizas;
import com.mycompany.views.principal;
import com.mycompany.views.solicitud;
import com.mycompany.views.transferencia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import login.ss;

/**
 *
 * @author mp503
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() throws SQLException {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
    }
    
    private void InitStyles(){
        mensaje.putClientProperty( "FlatLaf.style", "font: 14 $light.font" );
        mensaje.setForeground(Color.black);
        navtext.putClientProperty( "FlatLaf.style", "font: $h3.font" );
        navtext.setForeground(Color.white);
        datetext.putClientProperty( "FlatLaf.style", "font: 22 $light.font" );
        datetext.setForeground(Color.WHITE);
    }
    
    private void SetDate(){
    Date fechaActual = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    datetext.setText(formatoFecha.format(fechaActual));
        
        
    }
    
    private void InitContent() throws SQLException {
        ShowJPanel(new principal()); 
    }
    
    private void ShowJPanel(JPanel p){
        p.setSize(750,430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER );
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        appname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnproduct = new javax.swing.JButton();
        btndivizas = new javax.swing.JButton();
        btntransfe = new javax.swing.JButton();
        btnsolicitud = new javax.swing.JButton();
        btnconfi = new javax.swing.JButton();
        btnpagar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        navtext = new javax.swing.JLabel();
        datetext = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        principal.setBackground(new java.awt.Color(102, 102, 102));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        appname.setForeground(new java.awt.Color(255, 255, 255));
        appname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appname.setText("BDT");
        principal.add(appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 38, 150, 62));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 106, 193, 13));

        btnproduct.setBackground(new java.awt.Color(51, 51, 51));
        btnproduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnproduct.setForeground(new java.awt.Color(255, 255, 255));
        btnproduct.setText("productos");
        btnproduct.setBorder(null);
        btnproduct.setBorderPainted(false);
        btnproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductActionPerformed(evt);
            }
        });
        principal.add(btnproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 60));

        btndivizas.setBackground(new java.awt.Color(51, 51, 51));
        btndivizas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndivizas.setForeground(new java.awt.Color(255, 255, 255));
        btndivizas.setText("divizas");
        btndivizas.setBorder(null);
        btndivizas.setBorderPainted(false);
        btndivizas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndivizas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivizasActionPerformed(evt);
            }
        });
        principal.add(btndivizas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 60));

        btntransfe.setBackground(new java.awt.Color(51, 51, 51));
        btntransfe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btntransfe.setForeground(new java.awt.Color(255, 255, 255));
        btntransfe.setText("transferir");
        btntransfe.setBorder(null);
        btntransfe.setBorderPainted(false);
        btntransfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransfeActionPerformed(evt);
            }
        });
        principal.add(btntransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 59));

        btnsolicitud.setBackground(new java.awt.Color(51, 51, 51));
        btnsolicitud.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnsolicitud.setText("solicitud");
        btnsolicitud.setBorder(null);
        btnsolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolicitudActionPerformed(evt);
            }
        });
        principal.add(btnsolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 60));

        btnconfi.setBackground(new java.awt.Color(51, 51, 51));
        btnconfi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnconfi.setForeground(new java.awt.Color(255, 255, 255));
        btnconfi.setText("configuracion");
        btnconfi.setBorder(null);
        btnconfi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnconfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfiActionPerformed(evt);
            }
        });
        principal.add(btnconfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 60));

        btnpagar.setBackground(new java.awt.Color(51, 51, 51));
        btnpagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnpagar.setForeground(new java.awt.Color(255, 255, 255));
        btnpagar.setText("pagar");
        btnpagar.setBorder(null);
        btnpagar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });
        principal.add(btnpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 50));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("cerrar sesion");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        principal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));
        principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.setBackground(new java.awt.Color(51, 51, 51));

        navtext.setText("Mis productos");

        datetext.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        datetext.setText("Hoy es lunes 15 de Abril");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(navtext, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mensaje.setBackground(new java.awt.Color(0, 0, 0));
        mensaje.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(51, 51, 51));
        mensaje.setText("Bienvenido");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductActionPerformed
        try { 
            ShowJPanel(new principal());
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnproductActionPerformed

    private void btndivizasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivizasActionPerformed
        ShowJPanel(new divizas()); 
    }//GEN-LAST:event_btndivizasActionPerformed

    private void btnsolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolicitudActionPerformed
        ShowJPanel(new solicitud()); 
    }//GEN-LAST:event_btnsolicitudActionPerformed

    private void btntransfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransfeActionPerformed
        ShowJPanel(new transferencia());    }//GEN-LAST:event_btntransfeActionPerformed

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpagarActionPerformed

    private void btnconfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconfiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ss s = new ss();
        s.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       FlatLightLaf.setup();
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appname;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnconfi;
    private javax.swing.JButton btndivizas;
    private javax.swing.JButton btnpagar;
    private javax.swing.JButton btnproduct;
    private javax.swing.JButton btnsolicitud;
    private javax.swing.JButton btntransfe;
    private javax.swing.JPanel content;
    private javax.swing.JLabel datetext;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel navtext;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}

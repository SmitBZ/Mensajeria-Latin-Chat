package Interfaces;

import javax.swing.JTextArea;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author smit1
 */

public class InterfazGeneral extends javax.swing.JFrame {
    
    public InterfazGeneral() {
        initComponents();
        this.cliente = new Cliente(this);
        transparent();
    }
    
    public JTextArea getAreatexto(){
        return this.areaTexto;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PanelInterfaz = new javax.swing.JPanel();
        texEnviarArchivo = new javax.swing.JButton();
        mensajes = new javax.swing.JTextField();
        TTITULO = new javax.swing.JLabel();
        gifI = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        textMensajes = new javax.swing.JButton();
        gifI2 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textIP = new javax.swing.JTextField();
        botonConectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textUSERAnonimo = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cupido_zps85b2e23e.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelInterfaz.setBackground(new java.awt.Color(255, 0, 0));
        PanelInterfaz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texEnviarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subiendo.png"))); // NOI18N
        texEnviarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texEnviarArchivoActionPerformed(evt);
            }
        });
        PanelInterfaz.add(texEnviarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 110, 40));

        mensajes.setBackground(new java.awt.Color(255, 204, 204));
        mensajes.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        mensajes.setBorder(new javax.swing.border.MatteBorder(null));
        mensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajesActionPerformed(evt);
            }
        });
        PanelInterfaz.add(mensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 890, 40));

        TTITULO.setBackground(new java.awt.Color(255, 255, 255));
        TTITULO.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        TTITULO.setText("LATIN CHAT");
        PanelInterfaz.add(TTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 290, 80));

        gifI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x_loveorden.gif"))); // NOI18N
        PanelInterfaz.add(gifI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 90));

        areaTexto.setBackground(new java.awt.Color(255, 204, 204));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        PanelInterfaz.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 930, 460));

        textMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/correo.png"))); // NOI18N
        textMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMensajesActionPerformed(evt);
            }
        });
        PanelInterfaz.add(textMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 670, 110, 50));

        gifI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buho-mail.gif"))); // NOI18N
        PanelInterfaz.add(gifI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        botonLimpiar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrador (2).png"))); // NOI18N
        botonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        PanelInterfaz.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 110, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setText("Usuario Anonimo:");
        PanelInterfaz.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 30));

        textIP.setBackground(new java.awt.Color(255, 204, 204));
        PanelInterfaz.add(textIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 160, -1));

        botonConectar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        botonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/conectado.png"))); // NOI18N
        botonConectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });
        PanelInterfaz.add(botonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 80, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/goku.gif"))); // NOI18N
        PanelInterfaz.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cupido_zps85b2e23e.gif"))); // NOI18N
        PanelInterfaz.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x_ani_logoy.gif"))); // NOI18N
        PanelInterfaz.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel7.setText("INGRESE EL IP:");
        PanelInterfaz.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, 30));

        textUSERAnonimo.setBackground(new java.awt.Color(255, 204, 204));
        textUSERAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUSERAnonimoActionPerformed(evt);
            }
        });
        PanelInterfaz.add(textUSERAnonimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInterfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void texEnviarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texEnviarArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.cliente.enviar("Enviado archivo: " + selectedFile.getName());
        }
    }//GEN-LAST:event_texEnviarArchivoActionPerformed

    private void mensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajesActionPerformed

    }//GEN-LAST:event_mensajesActionPerformed

    private void textMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMensajesActionPerformed
        this.cliente.enviar(this.mensajes.getText());
        this.mensajes.setText("");
    }//GEN-LAST:event_textMensajesActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        areaTexto.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed

        if(this.cliente.conectar(this.textIP.getText(),textUSERAnonimo.getText())){
            
        }else {
            JOptionPane.showMessageDialog(this, "Error de Servidor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConectarActionPerformed

    private void textUSERAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUSERAnonimoActionPerformed

    }//GEN-LAST:event_textUSERAnonimoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void transparent(){
        //Area de transaperencia de boton de enviar archivos
        texEnviarArchivo.setOpaque(false);
        texEnviarArchivo.setBorderPainted(false);
        
        //Area de transparencia de boton de mensajes
        textMensajes.setOpaque(false);
        textMensajes.setBorderPainted(false);
    }
    
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
            java.util.logging.Logger.getLogger(InterfazGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGeneral().setVisible(true);
            }
        });
    }
    
    private Cliente cliente;
    private Logeo log;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInterfaz;
    private javax.swing.JLabel TTITULO;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botonConectar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JLabel gifI;
    private javax.swing.JLabel gifI2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mensajes;
    private javax.swing.JButton texEnviarArchivo;
    private javax.swing.JTextField textIP;
    private javax.swing.JButton textMensajes;
    private javax.swing.JTextField textUSERAnonimo;
    // End of variables declaration//GEN-END:variables
}

package Interfaces;

import java.awt.event.ComponentListener;
import javax.swing.JOptionPane;
import CONEXION.SQLIdentifacion;

/**
 *
 * @author smit1
 */
public class Logeo extends javax.swing.JFrame {
    

    public Logeo() {
        initComponents();
    }
    
    SQLIdentifacion iden = new SQLIdentifacion();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        textUsuario = new javax.swing.JTextField();
        textPasword = new javax.swing.JPasswordField();
        textoPasword = new javax.swing.JLabel();
        textoUser = new javax.swing.JLabel();
        botonCrear = new javax.swing.JToggleButton();
        botonInicio1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gif2 = new javax.swing.JLabel();
        gif = new javax.swing.JLabel();
        gif3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(1024, 768));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textUsuario.setBackground(new java.awt.Color(204, 204, 204));
        textUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        Panel.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 370, 40));

        textPasword.setBackground(new java.awt.Color(204, 204, 204));
        textPasword.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        textPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaswordActionPerformed(evt);
            }
        });
        Panel.add(textPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 370, 40));

        textoPasword.setFont(new java.awt.Font("Complex_IV25", 3, 18)); // NOI18N
        textoPasword.setText("   Ingrese su contraseña");
        textoPasword.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
        Panel.add(textoPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 370, 40));

        textoUser.setFont(new java.awt.Font("Complex_IV25", 3, 18)); // NOI18N
        textoUser.setText("    Ingrese su usuario");
        textoUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
        Panel.add(textoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 370, 40));

        botonCrear.setBackground(new java.awt.Color(255, 0, 0));
        botonCrear.setFont(new java.awt.Font("Wide Latin", 2, 24)); // NOI18N
        botonCrear.setText("Crear Cuenta");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        Panel.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 370, 40));

        botonInicio1.setBackground(new java.awt.Color(51, 255, 0));
        botonInicio1.setFont(new java.awt.Font("Wide Latin", 2, 24)); // NOI18N
        botonInicio1.setText("Iniciar Sesion");
        botonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicio1ActionPerformed(evt);
            }
        });
        Panel.add(botonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear.png"))); // NOI18N
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 70, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2023-12-07 142521.png"))); // NOI18N
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 240, 150));

        gif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/heart-493_128.gif"))); // NOI18N
        Panel.add(gif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 140));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/love-6853_128.gif"))); // NOI18N
        gif.setText("jLabel5");
        Panel.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 130, 140));

        gif3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/03.gif"))); // NOI18N
        Panel.add(gif3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void textPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textPaswordActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
       Registro reg = new Registro();
       reg.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicio1ActionPerformed
        String usuario = textUsuario.getText();
        String password = textPasword.getText();
        
        if(usuario.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de ingresar");
            return;
        }
        
        try{
            iden.connLogin(textUsuario.getText(), textPasword.getText());
            setVisible(false);
        }catch(Exception e){
            mostrarMensajeError("Error al conectar: " + e.getMessage());
        }
    }//GEN-LAST:event_botonInicio1ActionPerformed
    
    private void mostrarMensajeError(String mensaje) {
    JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
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
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logeo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JToggleButton botonCrear;
    private javax.swing.JToggleButton botonInicio1;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel gif2;
    private javax.swing.JLabel gif3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textPasword;
    private javax.swing.JTextField textUsuario;
    private javax.swing.JLabel textoPasword;
    private javax.swing.JLabel textoUser;
    // End of variables declaration//GEN-END:variables
}

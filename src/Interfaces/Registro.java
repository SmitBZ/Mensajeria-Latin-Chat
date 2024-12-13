package Interfaces;

import CONEXION.SQLRegistro;
import CONEXION.Usuarios;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author smit1
 */

public class Registro extends javax.swing.JFrame {
    public Registro() {
        initComponents();
        transparent();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        PaswordNew = new javax.swing.JTextField();
        textRegistro = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        UserNew = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        botonRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        Nombres = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 51, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaswordNew.setBackground(new java.awt.Color(204, 204, 204));
        PaswordNew.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        PaswordNew.setText("Contraseña");
        PaswordNew.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        PaswordNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PaswordNewFocusGained(evt);
            }
        });
        PaswordNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaswordNewActionPerformed(evt);
            }
        });
        panel.add(PaswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 340, 50));

        textRegistro.setBackground(new java.awt.Color(255, 255, 255));
        textRegistro.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        textRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textRegistro.setText("Registro");
        panel.add(textRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 190, 40));

        Email.setBackground(new java.awt.Color(204, 204, 204));
        Email.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        Email.setText("Correo Electronico");
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        panel.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 340, 50));

        UserNew.setBackground(new java.awt.Color(204, 204, 204));
        UserNew.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        UserNew.setText("Nombre de Usuario");
        UserNew.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        UserNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserNewFocusGained(evt);
            }
        });
        UserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNewActionPerformed(evt);
            }
        });
        panel.add(UserNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 340, 50));

        Apellidos.setBackground(new java.awt.Color(204, 204, 204));
        Apellidos.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        Apellidos.setText("Apellidos");
        Apellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApellidosFocusGained(evt);
            }
        });
        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });
        panel.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 340, 50));

        botonRegistro.setBackground(new java.awt.Color(153, 102, 255));
        botonRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("Registrarse");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        panel.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 360, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/thumbs-up-832_256.gif"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 300, 190, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x_cuclove.gif"))); // NOI18N
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 90, 110));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        panel.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 60));

        Nombres.setBackground(new java.awt.Color(204, 204, 204));
        Nombres.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        Nombres.setText("Nombres");
        Nombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Nombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombresFocusGained(evt);
            }
        });
        Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresActionPerformed(evt);
            }
        });
        panel.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void PaswordNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaswordNewActionPerformed
     
    }//GEN-LAST:event_PaswordNewActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void UserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNewActionPerformed

    }//GEN-LAST:event_UserNewActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed

    }//GEN-LAST:event_ApellidosActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        //Variables
        
        String nombre = Nombres.getText();
        String apellidos = Apellidos.getText();
        String mail = Email.getText();
        String usuario = UserNew.getText();
        String password = PaswordNew.getText(); 
        
        /**
         * @author Smit BZ
         * @param fucion de campos
         * permite verificar si los campoos que estan en el registro estan completos
         * si estan vacion genereara un dialogo de que debge completar los campos
         */
        
        if (nombre.isEmpty() || apellidos.isEmpty() || mail.isEmpty() || usuario.isEmpty() || password.isEmpty()) 
        {
        JOptionPane.showMessageDialog(this, "Completa todos los campos antes de registrar");
        return;
        }
        
        Usuarios usuarioNew = new Usuarios(nombre, apellidos, mail, usuario,password);
        SQLRegistro ur = new SQLRegistro();
        
        //manejo de errores
        try{
           boolean registroExitoso = ur.registrar(usuarioNew); 
           JOptionPane.showMessageDialog(this, "Registro exitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error en el registro");
        }
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        Logeo log = new Logeo();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresActionPerformed

    private void NombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombresFocusGained
        if(Nombres.getText().equals("Nombres")){
            Nombres.setText("");
        }
    }//GEN-LAST:event_NombresFocusGained

    private void ApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidosFocusGained
        if(Apellidos.getText().equals("Apellidos")){
            Apellidos.setText("");
        }
    }//GEN-LAST:event_ApellidosFocusGained

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        if(Email.getText().equals("Correo Electronico")){
            Email.setText("");
        }    
    }//GEN-LAST:event_EmailFocusGained

    private void UserNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserNewFocusGained
        if(UserNew.getText().equals("Nombre de Usuario")){
            UserNew.setText("");
        }
    }//GEN-LAST:event_UserNewFocusGained

    private void PaswordNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaswordNewFocusGained
        if(PaswordNew.getText().equals("Contraseña")){
            PaswordNew.setText("");
        }
    }//GEN-LAST:event_PaswordNewFocusGained

    public void transparent(){
        //Area de transaperencia de boton de enviar archivos
        botonRegresar.setOpaque(false);
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField PaswordNew;
    private javax.swing.JTextField UserNew;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel textRegistro;
    // End of variables declaration//GEN-END:variables
}

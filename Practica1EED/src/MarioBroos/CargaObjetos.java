/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarioBroos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author William
 */
public class CargaObjetos extends javax.swing.JFrame {

public static listadeobjetos list= new listadeobjetos();
String imagen="";
String nombre="";
    /**
     * Creates new form CargaObjetos
     */
    public CargaObjetos() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Ver lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 450, 71, 23);

        jLabel1.setText("Objetos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(44, 29, 38, 14);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(225, 29, 37, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/castillos.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 72, 102, 54);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadrosigno.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 102, 66);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 80, 95, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 150, 95, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hongo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 220, 102, 79);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 250, 95, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 340, 95, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/koopa.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 320, 90, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Goomba.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 430, 90, 70);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 440, 95, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 530, 95, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moneda.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 520, 60, 64);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pared.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 60, 80, 62);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(670, 80, 95, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mario.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 180, 90, 85);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(690, 210, 95, 30);

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 80, 71, 23);

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 150, 71, 23);

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 250, 71, 23);

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 340, 71, 23);

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(350, 450, 71, 23);

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(350, 530, 71, 23);

        jButton8.setText("Agregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(810, 80, 71, 23);

        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(860, 210, 71, 23);

        jButton10.setText("Siguiente");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(810, 460, 77, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new ListaObejtos().setVisible(true);
       objeto aux = listadeobjetos.primero;
       ListaObejtos.jTextField1.setText(aux.getnombre());
       ImageIcon fotogra = new ImageIcon(aux.imagen);
       ListaObejtos.jLabel1.setIcon(fotogra);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/castillos.jpg";
        nombre=jTextField1.getText();
        add();
        jTextField1.setText("");
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/cuadrosigno.jpg";
        nombre=jTextField2.getText();
        add();
        jTextField2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/hongo.jpg";
        nombre=jTextField3.getText();
        add();
        jTextField3.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/koopa.jpg";
        nombre=jTextField4.getText();
        add();
        jTextField4.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/Goomba.jpg";
        nombre=jTextField5.getText();
        add();
        jTextField5.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/moneda.jpg";
        nombre=jTextField6.getText();
        add();
        jTextField6.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/pared.png";
        nombre=jTextField7.getText();
        add();
        jTextField7.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        imagen="C:/Users/William/Documents/NetBeansProjects/Practica1EED/src/imagenes/mario.jpg";
        nombre=jTextField8.getText();
        add();
        jTextField8.setText("");
        jButton9.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Metodoextraer().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

public boolean add(){
list.add(nombre,imagen);
return true;
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
            java.util.logging.Logger.getLogger(CargaObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>             
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaObjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
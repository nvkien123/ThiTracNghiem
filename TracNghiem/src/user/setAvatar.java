/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import function.fileData;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author NGUYEN VAN KIEN
 */
public class setAvatar extends javax.swing.JFrame {

    /**
     * Creates new form setAvatar
     */
    public int avatar =1;
    public setAvatar() {
        initComponents();
        setLocationRelativeTo(null);
        javax.swing.JButton[] avatarX = {avatar1,avatar2,avatar3,avatar4,avatar5,avatar6,avatar7,avatar8,avatar9,avatar10,avatar1};
        for(int i=0;i<10;i++){
            ImageIcon icon;
            icon = new ImageIcon("src/data/img_avatar/avatar"+ String.valueOf(i+1) +".png");
            avatarX[i].setIcon(icon);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar3 = new javax.swing.JButton();
        avatar2 = new javax.swing.JButton();
        avatar4 = new javax.swing.JButton();
        avatar5 = new javax.swing.JButton();
        avatar1 = new javax.swing.JButton();
        avatar7 = new javax.swing.JButton();
        avatar8 = new javax.swing.JButton();
        avatar9 = new javax.swing.JButton();
        avatar10 = new javax.swing.JButton();
        avatar6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thay đổi ảnh đại diện");

        avatar3.setText("avatar3");
        avatar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar3ActionPerformed(evt);
            }
        });

        avatar2.setText("avatar2");
        avatar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar2ActionPerformed(evt);
            }
        });

        avatar4.setText("avatar4");
        avatar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar4ActionPerformed(evt);
            }
        });

        avatar5.setText("avatar5");
        avatar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar5ActionPerformed(evt);
            }
        });

        avatar1.setText("avatar1");
        avatar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar1ActionPerformed(evt);
            }
        });

        avatar7.setText("avatar7");
        avatar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar7ActionPerformed(evt);
            }
        });

        avatar8.setText("avatar8");
        avatar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar8ActionPerformed(evt);
            }
        });

        avatar9.setText("avatar9");
        avatar9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar9ActionPerformed(evt);
            }
        });

        avatar10.setText("avatar10");
        avatar10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar10ActionPerformed(evt);
            }
        });

        avatar6.setText("avatar6");
        avatar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        avatar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        avatar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatar6ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Chọn");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(avatar6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avatar7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(avatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avatar8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avatar9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avatar10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avatar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avatar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar1ActionPerformed
        avatar = 1;
    }//GEN-LAST:event_avatar1ActionPerformed

    private void avatar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar2ActionPerformed
         avatar = 2;
    }//GEN-LAST:event_avatar2ActionPerformed

    private void avatar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar3ActionPerformed
         avatar = 3;
    }//GEN-LAST:event_avatar3ActionPerformed

    private void avatar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar4ActionPerformed
         avatar = 4;
    }//GEN-LAST:event_avatar4ActionPerformed

    private void avatar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar5ActionPerformed
         avatar = 5;
    }//GEN-LAST:event_avatar5ActionPerformed

    private void avatar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar6ActionPerformed
         avatar = 6;
    }//GEN-LAST:event_avatar6ActionPerformed

    private void avatar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar7ActionPerformed
         avatar = 7;
    }//GEN-LAST:event_avatar7ActionPerformed

    private void avatar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar8ActionPerformed
         avatar = 8;
    }//GEN-LAST:event_avatar8ActionPerformed

    private void avatar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar9ActionPerformed
         avatar = 9;
    }//GEN-LAST:event_avatar9ActionPerformed

    private void avatar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatar10ActionPerformed
         avatar = 10;
    }//GEN-LAST:event_avatar10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            fileData.addAvatar(avatar);
            new userProfile().setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(setAvatar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(setAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setAvatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avatar1;
    private javax.swing.JButton avatar10;
    private javax.swing.JButton avatar2;
    private javax.swing.JButton avatar3;
    private javax.swing.JButton avatar4;
    private javax.swing.JButton avatar5;
    private javax.swing.JButton avatar6;
    private javax.swing.JButton avatar7;
    private javax.swing.JButton avatar8;
    private javax.swing.JButton avatar9;
    private javax.swing.JButton jButton11;
    // End of variables declaration//GEN-END:variables
}

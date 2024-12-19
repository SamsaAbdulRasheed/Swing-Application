package myswingapplication;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author samsa
 */
public class NumberGame extends javax.swing.JFrame {
    static int count=0;
    static int score=0;
    Random r=new Random();
    static int randnum;
   
    public NumberGame() {
        initComponents();
        randnum= r.nextInt(100);
        lbnumbers.setText(String.valueOf(randnum));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnodd = new javax.swing.JButton();
        btneven = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        lbscore = new javax.swing.JLabel();
        lbnumbers = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnodd.setBackground(new java.awt.Color(255, 0, 0));
        btnodd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnodd.setText("ODD");
        btnodd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoddActionPerformed(evt);
            }
        });

        btneven.setBackground(new java.awt.Color(255, 255, 0));
        btneven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btneven.setText("EVEN");
        btneven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnevenActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setText("SCORE");

        lbscore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbnumbers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnodd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btneven, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbscore, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lbnumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbnumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnodd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbscore, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnoddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoddActionPerformed
        count=count+1;
        int number=Integer.parseInt(lbnumbers.getText());
      
          if(count==10){
           if(number%2!=0){
               score=score+1;
               lbscore.setText(String.valueOf(score));
           }
           JOptionPane.showMessageDialog(this,"Your score is "+score+"/10");
           score=0;
           count=0;
            lbscore.setText(String.valueOf(""));
            randnum=r.nextInt(100);
               lbnumbers.setText(String.valueOf(randnum));
          }
           else{
                if(number%2!=0){
               score=score+1;
               lbscore.setText(String.valueOf(score));
               randnum=r.nextInt(100);
               lbnumbers.setText(String.valueOf(randnum));
                 }
                 else{
                randnum=r.nextInt(100);
                lbnumbers.setText(String.valueOf(randnum));
                }
            }
    }//GEN-LAST:event_btnoddActionPerformed

    private void btnevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnevenActionPerformed
        count=count+1;
        int number=Integer.parseInt(lbnumbers.getText());
        if(count==10){
            if(number%2==0){
                score=score+1;
                lbscore.setText(String.valueOf(score));
            }
//            else{
//                randnum=r.nextInt(100);
//            lbnumbers.setText(String.valueOf(randnum));
//            }
            JOptionPane.showMessageDialog(this,"Your Score is "+score+"/10");
            score=0;
            count=0;
            lbscore.setText("");
            randnum=r.nextInt(100);
            lbnumbers.setText(String.valueOf(randnum));
        }
        else{
            if(number%2==0){
                score=score+1;
                lbscore.setText(String.valueOf(score));
                randnum=r.nextInt(100);
                lbnumbers.setText(String.valueOf(randnum));
            }
            else{
                 randnum=r.nextInt(100);
                lbnumbers.setText(String.valueOf(randnum));
            }
        }
    }//GEN-LAST:event_btnevenActionPerformed

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
            java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NumberGame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneven;
    private javax.swing.JButton btnodd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbnumbers;
    private javax.swing.JLabel lbscore;
    // End of variables declaration//GEN-END:variables
}

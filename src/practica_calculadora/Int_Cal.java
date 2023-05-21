
package practica_calculadora;

/**
 *
 * @author Edu
 */
public class Int_Cal extends javax.swing.JFrame {
float Numero1=0, Numero2=0, Total=0;



    public Int_Cal() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BResta = new javax.swing.JButton();
        BSuma = new javax.swing.JButton();
        BMulti = new javax.swing.JButton();
        BIgual = new javax.swing.JButton();
        BDivi = new javax.swing.JButton();
        TV1 = new javax.swing.JTextField();
        TV2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Valor 1");

        jLabel2.setText("Valor 2");

        BResta.setText("Resta");
        BResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRestaActionPerformed(evt);
            }
        });

        BSuma.setText("Suma");
        BSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSumaActionPerformed(evt);
            }
        });

        BMulti.setText("Multiplicacion");
        BMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMultiActionPerformed(evt);
            }
        });

        BIgual.setText("Resultado");
        BIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIgualActionPerformed(evt);
            }
        });

        BDivi.setText("Division");
        BDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDiviActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TV1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TV2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BSuma)
                        .addGap(18, 18, 18)
                        .addComponent(BMulti))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BResta)
                        .addGap(18, 18, 18)
                        .addComponent(BDivi))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BIgual)
                            .addComponent(TR, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSuma)
                    .addComponent(BMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BResta)
                    .addComponent(BDivi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BIgual)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSumaActionPerformed
        Numero1 = Float.parseFloat(TV1.getText());
        Numero2 = Float.parseFloat(TV2.getText());
        Total = Numero1 + Numero2;
    }//GEN-LAST:event_BSumaActionPerformed

    private void BRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRestaActionPerformed
        Numero1 = Float.parseFloat(TV1.getText());
        Numero2 = Float.parseFloat(TV2.getText());
        Total = Numero1 - Numero2;
    }//GEN-LAST:event_BRestaActionPerformed

    private void BMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMultiActionPerformed
        Numero1 = Float.parseFloat(TV1.getText());
        Numero2 = Float.parseFloat(TV2.getText());
        Total = Numero1 * Numero2;
    }//GEN-LAST:event_BMultiActionPerformed

    private void BDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDiviActionPerformed
        Numero1 = Float.parseFloat(TV1.getText());
        Numero2 = Float.parseFloat(TV2.getText());
        Total = Numero1 / Numero2;
    }//GEN-LAST:event_BDiviActionPerformed

    private void BIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIgualActionPerformed
    TR.setText(String.valueOf(Total));
    }//GEN-LAST:event_BIgualActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Int_Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDivi;
    private javax.swing.JButton BIgual;
    private javax.swing.JButton BMulti;
    private javax.swing.JButton BResta;
    private javax.swing.JButton BSuma;
    private javax.swing.JTextField TR;
    private javax.swing.JTextField TV1;
    private javax.swing.JTextField TV2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

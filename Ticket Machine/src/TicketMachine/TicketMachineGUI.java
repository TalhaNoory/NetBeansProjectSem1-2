/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketMachine;

/**
 *
 * @author frede
 */
public class TicketMachineGUI extends javax.swing.JFrame {

    /**
     * Creates new form TicketMachineGUI
     */
    public TicketMachineGUI() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollBar1 = new javax.swing.JScrollBar();
        text1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        minutter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Afslut = new javax.swing.JButton();
        CheckBoxRed = new javax.swing.JCheckBox();
        CheckBoxGreen = new javax.swing.JCheckBox();
        CheckBoxBlue = new javax.swing.JCheckBox();
        CheckBoxYellow = new javax.swing.JCheckBox();
        CheckBoxCard = new javax.swing.JCheckBox();
        CheckBoxCash = new javax.swing.JCheckBox();
        PriceOutput = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text1.setText("Indtast antal minutter");
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Vælg Zone");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("Vælg betalingsform");

        Afslut.setText("Afslut");
        Afslut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfslutActionPerformed(evt);
            }
        });

        CheckBoxRed.setText("Rød");

        CheckBoxGreen.setText("Grøn");

        CheckBoxBlue.setText("Blå");

        CheckBoxYellow.setText("Gul");

        CheckBoxCard.setText("Kort");

        CheckBoxCash.setText("Kontant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text1)
                            .addComponent(minutter))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Afslut)
                                .addGap(27, 27, 27))
                            .addComponent(CheckBoxBlue)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckBoxRed)
                                    .addComponent(CheckBoxGreen))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckBoxCash)
                                    .addComponent(CheckBoxCard)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PriceOutput)
                                .addComponent(CheckBoxYellow))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxRed)
                    .addComponent(CheckBoxCard))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxGreen)
                    .addComponent(CheckBoxCash))
                .addGap(18, 18, 18)
                .addComponent(CheckBoxBlue)
                .addGap(18, 18, 18)
                .addComponent(CheckBoxYellow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Afslut)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addComponent(PriceOutput, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AfslutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfslutActionPerformed
        double time = Double.parseDouble(this.minutter.getText());
        Zone zone = null;
        Payment payment = null;
        TicketMachine tm = new TicketMachine();
        if (time % 30 != 0 || time < 1){
            this.PriceOutput.setText("Indtast venligt tiden i minutter over nul, rundet op til nærmeste halve time.");
        }
        else{
            
        if (this.CheckBoxRed.isSelected()){
            zone = Zone.RED;
//            if (this.CheckBoxBlue.isSelected()){
//            this.CheckBoxBlue.doClick();
//            }
//            else if (this.CheckBoxGreen.isSelected()){
//            this.CheckBoxGreen.doClick();
//            }
//            else if (this.CheckBoxYellow.isSelected()){
//                this.CheckBoxYellow.doClick();
//            }           
        }
        else if (this.CheckBoxGreen.isSelected()){
            zone = Zone.GREEN;
//            if (this.CheckBoxBlue.isSelected()){
//            this.CheckBoxBlue.doClick();
//            }
//            else if (this.CheckBoxRed.isSelected()){
//            this.CheckBoxRed.doClick();
//            }
//            else if (this.CheckBoxYellow.isSelected()){
//                this.CheckBoxYellow.doClick();
//            }           
        }
        else if (this.CheckBoxBlue.isSelected()){
            zone = Zone.BLUE;
//            if (this.CheckBoxGreen.isSelected()){
//            this.CheckBoxGreen.doClick();
//            }
//            else if (this.CheckBoxRed.isSelected()){
//            this.CheckBoxRed.doClick();
//            }
//            else if (this.CheckBoxYellow.isSelected()){
//                this.CheckBoxYellow.doClick();
//            }           
        }
        else if (this.CheckBoxYellow.isSelected()){
            zone = Zone.YELLOW;
//            if (this.CheckBoxBlue.isSelected()){
//            this.CheckBoxBlue.doClick();
//            }
//            else if (this.CheckBoxRed.isSelected()){
//            this.CheckBoxRed.doClick();
//            }
//            else if (this.CheckBoxGreen.isSelected()){
//                this.CheckBoxGreen.doClick();
//            }           
        }
        if (this.CheckBoxCard.isSelected()){
            payment = Payment.CARD;
//            if (this.CheckBoxCash.isSelected()){
//                this.CheckBoxCash.doClick();
//            }
        }
        else if (this.CheckBoxCash.isSelected()){
            payment = Payment.CASH;
//            if (this.CheckBoxCard.isSelected()){
//                this.CheckBoxCard.doClick();
//            }
        }
        double price = tm.calculatePrice(time, zone, payment);
        this.PriceOutput.setText("Prisen er: " + price + "kr");
        }
    }//GEN-LAST:event_AfslutActionPerformed

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
            java.util.logging.Logger.getLogger(TicketMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketMachineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afslut;
    private javax.swing.JCheckBox CheckBoxBlue;
    private javax.swing.JCheckBox CheckBoxCard;
    private javax.swing.JCheckBox CheckBoxCash;
    private javax.swing.JCheckBox CheckBoxGreen;
    private javax.swing.JCheckBox CheckBoxRed;
    private javax.swing.JCheckBox CheckBoxYellow;
    private javax.swing.JLabel PriceOutput;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField minutter;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}

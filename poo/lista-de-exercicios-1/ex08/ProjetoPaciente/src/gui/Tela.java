// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package gui;

import classes.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author vovo
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();

        this.setLocationRelativeTo(null);
        jButtonNovoCalculo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCalcularImc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonNovoCalculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paciente");

        jLabel1.setText("Nome");

        jLabel2.setText("Peso");

        jLabel3.setText("Altura");

        jButtonCalcularImc.setText("Calcular IMC");
        jButtonCalcularImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularImcActionPerformed(evt);
            }
        });

        jTextAreaSaida.setEditable(false);
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jLabel5.setText("Saída");

        jLabel6.setText("kg");

        jLabel7.setText("m");

        jButtonNovoCalculo.setText("Novo Cálculo");
        jButtonNovoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCalcularImc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovoCalculo))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcularImc)
                    .addComponent(jButtonNovoCalculo))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularImcActionPerformed
        try {
            Paciente humano = new Paciente();
            float imc = 0;

            humano.setNome(jTextFieldNome.getText());
            humano.setPeso(Float.parseFloat(jTextFieldPeso.getText().replace(",", ".")));
            humano.setAltura(Float.parseFloat(jTextFieldAltura.getText().replace(",", ".")));
            imc = humano.calcularImc();

            jTextAreaSaida.setText(String.format(
                    "DADOS DO PACIENTE\n"
                    + "--------------------------------------------\n"
                    + "NOME: %s\n"
                    + "PESO: %.2f\n"
                    + "ALTURA: %.2f\n"
                    + "--------------------------------------------\n"
                    + "IMC: %.1f\n"
                    + "DIAGNÓSTICO: %s",
                    humano.getNome(),
                    humano.getPeso(),
                    humano.getAltura(),
                    imc,
                    humano.calcularFaixa(imc)
            ));

            jTextFieldNome.setEnabled(false);
            jTextFieldPeso.setEnabled(false);
            jTextFieldAltura.setEnabled(false);

            jButtonNovoCalculo.setVisible(true);
            jButtonCalcularImc.setVisible(false);

            jTextAreaSaida.grabFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Opa!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCalcularImcActionPerformed

    private void jButtonNovoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCalculoActionPerformed

        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(true);
        jTextFieldPeso.setText("");
        jTextFieldPeso.setEnabled(true);
        jTextFieldAltura.setText("");
        jTextFieldAltura.setEnabled(true);
        jTextAreaSaida.setText("");

        jButtonNovoCalculo.setVisible(false);
        jButtonCalcularImc.setVisible(true);

        jTextFieldNome.grabFocus();

    }//GEN-LAST:event_jButtonNovoCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularImc;
    private javax.swing.JButton jButtonNovoCalculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}

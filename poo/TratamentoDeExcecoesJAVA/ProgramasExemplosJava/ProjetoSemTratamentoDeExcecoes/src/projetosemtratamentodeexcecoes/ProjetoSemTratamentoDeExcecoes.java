/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosemtratamentodeexcecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author eugenio
 */
public class ProjetoSemTratamentoDeExcecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada;
        int x;
        int y;
        entrada = JOptionPane.showInputDialog("Primeiro valor da Divisao");
        x = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Segundo valor da Divisao");
        y = Integer.parseInt(entrada);
        Matematica maquina = new Matematica();
        maquina.setValor1(x);
        maquina.setValor2(y);
        int resultado = maquina.dividir();
        JOptionPane.showMessageDialog(null, "Divisão = " + resultado);
    }
}

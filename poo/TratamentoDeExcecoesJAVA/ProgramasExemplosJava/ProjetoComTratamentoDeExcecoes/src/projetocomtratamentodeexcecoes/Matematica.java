/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomtratamentodeexcecoes;

/**
 *
 * @author eugenio
 */
public class Matematica {
    private int valor1 = 0;
    private int valor2 = 0;
    
    public void setValor1(int valorP){
        valor1 = valorP;
    }
    public void setValor2(int valorP){
        valor2 = valorP;
    }
    public int getValor1(){return valor1;}
    public int getValor2(){return valor2;}
    
    public int dividir()throws Exception{
        if(valor2==0) throw new Exception("Não existe divisao por zero");
        return valor1/valor2;
    }

}

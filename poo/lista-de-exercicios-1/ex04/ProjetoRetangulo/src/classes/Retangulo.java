// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------


package classes;

public class Retangulo {
    
    // ATRIBUTOS
    private int comprimento = 0;
    private int largura = 0;
    
    // GET
    public int getComprimento(){ return comprimento; }
    
    public int getLargura(){ return largura; }
    
    // SET
    public void setComprimento(int comprimento) throws Exception {
        if(comprimento <= 0) throw new Exception("O comprimento não pode ser <= 0");
        this.comprimento = comprimento;
    }
    
    public void setLargura(int largura) throws Exception {
        if (largura <= 0) throw new Exception("A largura não pode ser <= 0");
        this.largura = largura;
    }
    
    // CALCULOS
    public int calcularPerimetro() throws Exception {
        if(comprimento <= 0) throw new Exception("O comprimento não pode ser <= 0");
        if(largura <= 0) throw new Exception("A largura não pode ser <= 0");
        return ((largura + comprimento) * 2);
    }
    
    public int calcularArea() throws Exception {
        if(comprimento <= 0) throw new Exception("O comprimento não pode ser <= 0");
        if(largura <= 0) throw new Exception("A largura não pode ser <= 0");
        return (largura * comprimento);
    }
}

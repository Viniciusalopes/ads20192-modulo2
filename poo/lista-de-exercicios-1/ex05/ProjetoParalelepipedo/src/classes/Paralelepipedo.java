// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package classes;

public class Paralelepipedo {

    // ATRIBUTOS
    private int altura = 0;
    private int largura = 0;
    private int comprimento = 0;

    // GET
    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    // SET
    public void setAltura(int altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Altura inválida");
        }
        this.altura = altura;
    }

    public void setLargura(int largura) throws Exception {
        if (largura <= 0) {
            throw new Exception("Largura inválida");
        }
        this.largura = largura;
    }

    public void setComprimento(int comprimento) throws Exception {
        if (comprimento <= 0) {
            throw new Exception("Comprimento inválido");
        }
        this.comprimento = comprimento;
    }

    // CÁLCULOS
    public int calcularVolume() throws Exception {
        if (altura <= 0 || largura <= 0 || comprimento <= 0) {
            throw new Exception("Medidas inválidas");
        }
        return (altura * comprimento * largura);
    }

    public int calcularArea() throws Exception {
        if (altura <= 0 || largura <= 0 || comprimento <= 0) {
            throw new Exception("Medidas inválidas");
        }
        return (2 * (altura * largura + altura * comprimento + largura * comprimento));
    }

}

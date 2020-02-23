// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package classes;

public class Piramide {

    // ATRIBUTOS
    private float base = 0;
    private float altura = 0;

    // GET
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    // SET
    public void setBase(float base) throws Exception {
        if (base <= 0) {
            throw new Exception("Base não pode ser <= 0!");
        }
        this.base = base;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Altura não pode ser <= 0");
        }
        this.altura = altura;
    }

    // CÁLCULOS
    public float calcularVolume() throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new Exception("A Base e a Altura não podem ser <= 0!");
        }
        return (float) 1 / (float) 3 * base * altura;
    }
}

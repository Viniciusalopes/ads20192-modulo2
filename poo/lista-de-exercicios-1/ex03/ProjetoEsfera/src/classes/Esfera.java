// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package classes;

public class Esfera {

    // ATRIBUTOS
    private float raio = 0;

    // GET
    public float getRaio() {
        return raio;
    }

    // SET
    public void setRaio(float raio) throws Exception {
        if (raio < 0) {
            throw new Exception("O raio não pode ser negativo!");
        }
        this.raio = raio;
    }

    // CÁLCULOS
    public float calcularArea() throws Exception {
        if (raio < 0) {
            throw new Exception("O raio não pode ser negativo!");
        }
        return (float) (4 * 3.1415 * raio * raio);
    }

    public float calcularVolume() throws Exception {
        if (raio < 0) {
            throw new Exception("O raio não pode ser negativo!");
        }
        return (float) ((4.0 / 3.0) * 3.1415 * raio * raio * raio);
    }
}

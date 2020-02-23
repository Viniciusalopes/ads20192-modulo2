/**
 * Autor  : Vinicius Araujo Lopes <suporte@viniciusalopes.com.br>
 * Data : 22/02/2020 Projeto: POO - Lista de Exercícios 1 Licença: MIT
 * <https://opensource.org/licenses/MIT> - Copyright 2020 Viniciusalopes Tecnologia
 */
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
        return (float) ((4 / 3) * 3.1415 * raio * raio * raio);
    }
}

// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package classes;

public class Cone {

    // ATRIBUTOS
    private int raio = 0;
    private int altura = 0;

    // GET
    public int getRaio() {
        return raio;
    }

    public int getAltura() {
        return altura;
    }

    // SET
    public void setRaio(int raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("O raio não pode ser <= 0");
        }
        this.raio = raio;
    }

    public void setAltura(int altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("A altura não pode ser <= 0");
        }
        this.altura = altura;
    }

    // CÁLCULOS
    public float calcularGeriatriz() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        // O cálculo da geratriz é (Raiz Quadrada((altura 2 )+(raio 2 )))
        return (float) (Math.sqrt((altura * altura) + (raio * raio)));
    }

    public float calcularAreaLateral() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        // O cálculo da área lateral é (3.1415*raio*geratriz)
        return (float) (3.1415 * raio * calcularGeriatriz());
    }

    public float calcularAreaTotal() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        // O cálculo da área total é (3.1415*raio*(geratriz+raio))
        return (float) (3.1415 * raio * (calcularGeriatriz() + raio));
    }

    public float calcularVolume() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        // O cálculo do volume é (1.0/3.0*3.1415*raio 2 *altura)

        return (float) (1.0 / 3.0 * 3.1415 * (raio * raio) * altura);
    }
}

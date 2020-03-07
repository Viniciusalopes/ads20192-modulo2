/*
    Autor: Vinicius Araujo Lopes - 2º ADS - 02/03/2020
    Problema:
        2. Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto triângulo
    em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
    classe deverá ter as seguintes características: três lados, cálculo da área e encontrar os tipos do
    triângulo. Obs.: os valores dos lados não podem ser negativos e tem que formar um triângulo -
    cada lado individualmente tem que ser menor que a adição dos outros dois lados. Observações
    gerais de um triângulo:

    • quanto aos lados, pode ser equilátero ou isósceles ou escaleno;
    • quanto aos ângulos, pode ser acutângulo(A2<B2+C2) ou obtusângulo(A2>B2+C2) ou retângulo (A2=B2+C2);
    • área = raizQuadrada(T*(T-A)*(T-B)*(T-C)) onde T = (A+B+C)/2.
 */
package classes;

public class Triangulo {

    // ATRIBUTOS
    private float ladoA = 0;
    private float ladoB = 0;
    private float ladoC = 0;

    // CONSTRUTOR
    public Triangulo(float ladoA, float ladoB, float ladoC) throws Exception {
        validarMedidas(ladoA, ladoB, ladoC);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        // Tudo ouquei...
    }

    // GET
    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    // SET
    public void setLadoA(float ladoA) throws Exception {
        this.ladoA = ladoA;
    }

    public void setLadoB(float ladoB) throws Exception {
        this.ladoB = ladoB;
    }

    public void setLadoC(float ladoC) throws Exception {
        this.ladoC = ladoC;
    }

    // CÁLCULOS
    public void validarMedidas(float ladoA, float ladoB, float ladoC) throws Exception {

        // Nenhum lado pode ser negativo
        if (ladoA < 0 || ladoB < 0 || ladoC < 0) {
            throw new Exception("Nenhum dos valores dos lados pode ser negativo.");
        }

        /**
         * Para formar um triangulo, cada lado individualmente tem que ser menor
         * que a adição dos outros dois lados.
         */
        if ((ladoA >= (ladoB + ladoC)) || (ladoB >= (ladoA + ladoC)) || (ladoC >= (ladoA + ladoB))) {
            // Medidas NÃO formam um triângulo
            throw new Exception("As medidas não formam um triângulo.");
        }
    }

    public float calcularArea() throws Exception {

        // Verifica se as medidas do objeto são válidas
        validarMedidas(ladoA, ladoB, ladoC);

        //• área = raizQuadrada(T*(T-A)*(T-B)*(T-C)) onde T = (A+B+C)/2.
        float t = (float) ((ladoA + ladoB + ladoC) / 2.0);
        return (float) Math.sqrt(t * (t - ladoA) * (t - ladoB) * (t - ladoC));
    }

    public String classificarPorLados() throws Exception {
        // Verifica se as medidas do objeto são válidas
        validarMedidas(ladoA, ladoB, ladoC);

        // quanto aos lados, pode ser equilátero ou isósceles ou escaleno;
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Triângulo Equilátero";
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            return "Triângulo Escaleno";
        } else {
            return "Triângulo Isósceles";
        }
    }

    public String classificarPorAngulos() throws Exception {
        //quanto aos ângulos, pode ser:
        // acutângulo(A2<B2+C2) 
        // ou obtusângulo(A2>B2+C2) 
        // ou retângulo (A2=B2+C2);

        if ((ladoA * ladoA) < ((ladoB * ladoB) + (ladoC * ladoC))) {
            return "Triângulo Acutângulo";
        } else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
            return "Triângulo Obtusângulo";
        } else {// ladoA² == (ladoB² + ladoC²)
            return "Triângulo Retângulo";
        }
    }
}

package classes;

public class Cilindro {

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
    public float calcularAreaLateral() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        return (float) (2 * 3.1415 * raio * altura);
    }

    public float calcularAreaTotal() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        return (float) (2 * 3.1415 * raio * (altura + raio));
    }

    public float calcularVolume() throws Exception {
        if (raio <= 0 || altura <= 0) {
            throw new Exception("Medidas inválidas");
        }
        return (float) (3.1415 * raio * raio * altura);
    }
}

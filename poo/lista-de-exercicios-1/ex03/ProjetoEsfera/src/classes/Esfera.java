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

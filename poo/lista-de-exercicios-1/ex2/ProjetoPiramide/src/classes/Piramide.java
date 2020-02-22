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

    public float calcularVolume() throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new Exception("A Base e a Altura não podem ser <= 0!");
        }
        return (float) (1 / 3 * base * altura);
    }

}

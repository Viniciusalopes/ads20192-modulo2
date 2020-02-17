package classes;

/**
 *
 * @author vovo
 */
public class Piramide {

    // ATRIBUTOS ------------------------------------------------------------------------>
    private float base = 0;
    private float altura = 0;

    // MÉTODOS -------------------------------------------------------------------------->
    // GET ------------------------------------------------------------------------------>
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    // SET ------------------------------------------------------------------------------>
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularVolume() {
        return (float) (1.0 / 3.0 * base * altura);
    }
}

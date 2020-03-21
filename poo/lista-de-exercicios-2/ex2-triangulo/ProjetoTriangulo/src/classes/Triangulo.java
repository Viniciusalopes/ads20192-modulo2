package classes;

public class Triangulo {

    private int ladoA = 1;
    private int ladoB = 1;
    private int ladoC = 1;

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    private void setLados(int lado1, int lado2, int lado3) throws Exception {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new Exception("Lados não podem ser <= 0");
        }
        ladoA = lado1;
        ladoB = lado2;
        ladoC = lado3;
    }

    static public boolean formaTriangulo(int lado1, int lado2, int lado3) {
        return !((lado1 >= lado2 + lado3) || (lado2 >= lado1 + lado3) || (lado3 >= lado1 + lado2));
    }
}

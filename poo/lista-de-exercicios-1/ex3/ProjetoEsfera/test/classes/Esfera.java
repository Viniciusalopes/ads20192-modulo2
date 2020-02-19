/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author vovo
 */
public class Esfera {

    // ATRIBUTOS
    private float raio;

    // MÉTODOS
    // GET
    public float getRaio() {
        return raio;
    }

    //SET
    public void setRaio(float raio) {
        this.raio = raio;
    }

    //CÁLCULOS
    public float calcularArea() {
        // área total = (4*3.1415*raio² )

        return (float)(4 * 3.1415 * raio * raio);
    }

    public float calcularVolume() {
        // volume =((4.0/3.0)*3.1415*raio³ ).
        return (float)((4.0 / 3.0) * 3.1415 * Math.pow(raio, 3));
    }

}

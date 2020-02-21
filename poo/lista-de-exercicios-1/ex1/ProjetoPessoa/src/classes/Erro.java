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
public class Erro {

    // ATRIBUTOS
    private String codigo = "opa000";

    // CONSTRUTOR
    public Erro(String codigo) throws Exception {
        if (codigo.trim().length() == 0) {
            throw new Exception("err001");
        }
        this.codigo = codigo;
    }

    // GET
    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        switch (codigo) {
            case "nom001":
                return "Nome inválido";

            case "pes001":
                return "Peso inválido";

            case "alt001":
                return "Altura inválida";

            case "sex001":
                return "Sexo inválido";

            case "alt002":
                return "Impossível calcular o IMC. A altura é inválida";
            default:
                return codigo;
        }
    }
}

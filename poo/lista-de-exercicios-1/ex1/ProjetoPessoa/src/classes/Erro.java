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
    public Erro(String codigo) {
        this.codigo = codigo;
    }

    // GET
    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        // Códigos em ordem alfabética
        
        switch (codigo) {
            case "alt001":
                return "Altura inválida!";

            case "alt002":
                return "Impossível calcular o IMC! A altura é inválida.";
            
            case "cam001":
                return "Preencha todos os campos!";
         
            case "nom001":
                return "Nome inválido!";

            case "pes001":
                return "Peso inválido!";

            case "sex001":
                return "Sexo inválido!";
            
            case "val001":
                return "Valores inválidos!";
            
            default:
                return codigo;
        }
    }
}

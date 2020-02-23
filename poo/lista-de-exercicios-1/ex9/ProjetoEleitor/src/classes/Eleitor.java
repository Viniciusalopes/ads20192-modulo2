package classes;

import util.Util;

public class Eleitor {

    // ATRIBUTOS
    private String nome = "";
    private int anoDeNascimento = 0;

    // GET
    public String getNome() {
        return nome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    // SET
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() < 2) {
            throw new Exception("Nome inválido");
        }
        this.nome = nome;
    }

    public void setAnoDeNascimento(int anoDeNascimento) throws Exception {
        int anoAtual = Util.getAnoAtual();
        if (anoDeNascimento > anoAtual) {
            throw new Exception("O ano de nascimento não pode ser > " + anoAtual);
        }

        if (anoDeNascimento < 0) {
            throw new Exception("O ano não pode ser negativo");
        }
        this.anoDeNascimento = anoDeNascimento;
    }

    // CÁLCULOS
    public int getIdade() {
        return Util.getAnoAtual() - anoDeNascimento;
    }

    public String getTipoDeEleitor() {
        int idade = getIdade();

        if (idade < 16) {
            return "Não Eleitor";
        } else if (idade < 18 || idade > 65) {
            return "Eleitor Facultativo";
        } else {
            return "Eleitor Obrigatório";
        }
    }
}

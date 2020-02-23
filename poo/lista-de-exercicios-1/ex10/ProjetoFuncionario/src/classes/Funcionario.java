// ---------------------------------------------------------------------------------------------------------
// Copyright 2020 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>
// Licença      : MIT <https://opensource.org/licenses/MIT> 
// Data         : 22/02/2020
// Projeto      : POO - Lista de Exercícios 1 
// Repositório  : <https://github.com/Viniciusalopes/ads20192-modulo2/tree/master/poo/lista-de-exercicios-1>
// ---------------------------------------------------------------------------------------------------------

package classes;

public class Funcionario {

    // ATRIBUTOS
    private String nome = "";
    private float salario = 0;
    private int filhos = 0;

    // GET
    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getFilhos() {
        return filhos;
    }

    // SET
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() < 2) {
            throw new Exception("Nome inválido");
        }
        this.nome = nome;
    }

    public void setSalario(float salario) throws Exception {
        if (salario < 0) {
            throw new Exception("Salário não pode ser < 0");
        }
        this.salario = salario;
    }

    public void setFilhos(int filhos) throws Exception {
        if (filhos < 0) {
            throw new Exception("Quantidade de filhos não pode ser < 0");
        }
        this.filhos = filhos;
    }

    // CÁLCULOS
    public float getAumentoSalarial(float percent) throws Exception {
        if (percent <= 0) {
            throw new Exception("Percentual de aumento não pode ser <= 0");
        }
        return (salario * (percent / 100));
    }

    public float getInssAliquota() {
        if (salario <= (float) 2545) {
            return (float) 6;
        } else {
            return (float) 10;
        }
    }

    public float getInssValor() {
        return (float) (salario * (getInssAliquota() / 100));
    }

    public float getIrAliquota() {
        if (salario < (float) 1903.99) {
            return 0;
        } else if (salario < (float) 2826.66) {
            return (float) 7.5;
        } else if (salario < (float) 3751.06) {
            return (float) 15;
        } else if (salario < (float) 4664.68) {
            return (float) 22.5;
        } else {
            return (float) 27.5;
        }
    }

    public float getIrParcela() {
        return (float) (salario * (getIrAliquota() / 100));
    }

    public float getIrValorMensal() throws Exception {
        float valor = (float) (getIrParcela() - (filhos * 545));
        /* 
        E agora, José?
        
        if (valor < 0) {
            Mensagem de erro ou valor = 0 ??
        }
         */
        return valor;
    }
}

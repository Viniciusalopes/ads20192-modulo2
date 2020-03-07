/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author vin
 */
public class ContaPoupanca {

    private String nomeDoCliente = "";
    private int numeroDaConta = 0;
    private int agencia = 0;
    private float saldo = 0;

    /**
     * @return the nomeDoCliente
     */
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    /**
     * @param nomeDoCliente the nomeDoCliente to set
     */
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    /**
     * @return the numeroDaConta
     */
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    /**
     * @param numeroDaConta the numeroDaConta to set
     */
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    public float sacar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor não pode ser <= 0");
        }
        if (valor > getSaldo()) {
            throw new Exception("Valor não pode ser > sakdi 0");
        }
        saldo -= valor;
        return valor;
    }

    public void depositar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor não pode ser <= 0");
        }
        saldo += valor;
    }

}

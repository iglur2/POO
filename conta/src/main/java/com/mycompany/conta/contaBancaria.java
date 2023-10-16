/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conta;

/**
 *
 * @author LabJF
 */
public class contaBancaria {

    private String titular;
    private double saldo;
    private String agencia;
    private String numero;

    //construtor
    public contaBancaria(String titular, String numero, String agencia) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
        this.agencia = agencia;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    //Merodo de saque
    public boolean saque(double valor) {
        if (valor > 0 && valor <= this.saldo) { // valor do saque nao pode ser negativo e nem menor que o saldo disponivel
            this.saldo -= valor;
            System.out.println("Saque de valor " + valor + " realizado. Saldo restante de: " + saldo);
            return true; // saque bem-ucedido
        } else {
            System.out.println("Valor de saque invalido");
            return false; // saque mal-sucedido
        }
    }

    public void deposito(double valor) {
        if (valor > 0) { // valor do deposito nao pode ser negativo
            this.saldo += valor;
            System.out.println("Deposito de valor " + valor + " realizado. Saldo atual de: " + saldo); // depodito bem-sucedido
        } else {
            System.out.println("Valor de deposito invalido"); // deposito mal-sucedido
        }

    }
}

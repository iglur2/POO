/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author LabJF
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int incremento) {
        if(incremento > 0) {
            this.velocidade += incremento;
        }
    }

    public void frear(int decremento) {
        if(decremento > 0 && this.velocidade - decremento >= 0) {
            this.velocidade -= decremento;
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidade: " + velocidade + " km/h");
    }
}


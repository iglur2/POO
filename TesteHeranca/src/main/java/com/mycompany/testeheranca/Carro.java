/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca;

/**
 *
 * @author LabJF
 */
public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + portas);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca;

/**
 *
 * @author LabJF
 */
public class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

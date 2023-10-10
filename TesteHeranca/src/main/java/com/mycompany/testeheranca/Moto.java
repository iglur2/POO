/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca;

/**
 *
 * @author LabJF
 */
public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author LabJF
 */
public class TesteEncapsulamento {

    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("Toyota", "Corolla");

        meuCarro.acelerar(50);
        meuCarro.exibirInfo();

        meuCarro.frear(20);
        meuCarro.exibirInfo();

        // Tentativa de "burlar" o encapsulamento acelerando com um valor negativo
        // Isso não vai ter efeito, graças ao encapsulamento
        meuCarro.acelerar(-100);
        meuCarro.exibirInfo();
    }
}

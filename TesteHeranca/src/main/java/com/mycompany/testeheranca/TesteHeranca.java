/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeheranca;

/**
 *
 * @author LabJF
 */
public class TesteHeranca {

    public static void main(String[] args) {
        Moto minhaMoto = new Moto("Honda", "CBR", 1000);
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);

        System.out.println("Info da Moto:");
        minhaMoto.exibirInfo();

        System.out.println("\nInfo do Carro:");
        meuCarro.exibirInfo();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notebook;

import java.util.Scanner;

/**
 *
 * @author LabJF
 */
public class mainNotebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a marca do notebook:");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo do notebook:");
        String modelo = sc.nextLine();
        System.out.println("Digite o tamanha da tels do notebook:");
        double tela = sc.nextDouble();
        
        Notebook notebookPadrao = new Notebook();
        Notebook notebookCustom = new Notebook(marca, modelo, tela);
        
        System.out.println("Notebook Padrão:");
        System.out.println("Marca: " + notebookPadrao.getMarca());
        System.out.println("Modelo: " + notebookPadrao.getModelo());
        System.out.println("Tela: " + notebookPadrao.getTela());

        System.out.println("\nNotebook customizado:");
        System.out.println("Marca: " + notebookCustom.getMarca());
        System.out.println("Modelo: " + notebookCustom.getModelo());
        System.out.println("Tela: " + notebookCustom.getTela());
    }
}

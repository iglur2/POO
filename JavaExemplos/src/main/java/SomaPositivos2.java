/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabJF
 */
import java.util.Scanner;

public class SomaPositivos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;
        System.out.println("Digite números. Para sair, digite um número negativo.");
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite outro número: ");
            numero = sc.nextInt();
        }
        System.out.println("Soma dos números positivos: " + soma);
    }
}
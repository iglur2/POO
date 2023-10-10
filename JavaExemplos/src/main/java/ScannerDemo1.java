/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabJF
 */
import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
// Declare o objeto da classe Scanner (sc)
        Scanner sc = new Scanner(System.in);
// entrada de uma String
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
// entrada de um Caracter
        System.out.println("Digite seu gênero (M/F):");
        char genero = sc.next().charAt(0);
// entrada de um número int
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
// entrada de um número long
        System.out.println("Digite seu número de celular:");
        long fone = sc.nextLong();
// entrada de um número double
        System.out.println("Digite um código (formato decimal):");
        double cod = sc.nextDouble();
// Imprimindo os valores para checar as entradas:
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
        System.out.println("Número do celular: " + fone);
        System.out.println("COD: " + cod);
// Fecha o scanner para liberar recursos
        sc.close();
    }
}
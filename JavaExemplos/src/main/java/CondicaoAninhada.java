/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabJF
 */
import java.util.Scanner;

public class CondicaoAninhada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Solicitar o primeiro número ao usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
// Solicitar o segundo número ao usuário
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
// Comparar os números e exibir o resultado
        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número(" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é menor que o segundo número(" + numero2 + ").");
        } else {
            System.out.println("Os dois números são iguais.");
        }
// Fechar o scanner
        scanner.close();
    }
}

/*
package program.aula; (Nome do pacote deve coincidir com o nomeado no NetBeans)
 */
import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
// Solicita ao usuário a quantidade de números a serem lidos
        System.out.print("Informe a quantidade N de números a serem lidos: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            // Verifica se o número é ímpar e, em caso afirmativo, adiciona à soma
            if (numero % 2 != 0) {
                soma += numero;
            }
        }
        System.out.println("A soma dos números ímpares é: " + soma);
    }
}

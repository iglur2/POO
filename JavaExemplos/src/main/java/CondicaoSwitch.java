/*
package program.aula; (Nome do pacote deve coincidir com o nomeado no NetBeans)
 */
import java.util.Scanner;

public class CondicaoSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        
        System.out.println("Escolha o tipo de desconto (10, 20, 30): ");
        int desconto = sc.nextInt();
        
        switch (desconto){
            case 10:
                valor *=0.9;
                break;
            case 20:
                valor *=0.8;
                break;
            case 30:
                valor *=0.7;
                break;
            default:
                System.out.println("Desconto inválido.");
                return;
        }
        System.out.println("Valor do produto após desconto:" +valor);
    }
    }
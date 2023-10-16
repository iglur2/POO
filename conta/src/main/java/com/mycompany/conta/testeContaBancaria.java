
package com.mycompany.conta;

import java.util.Scanner;

/**
 *
 * @author iglut
 */
public class testeContaBancaria {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Inserir titular
        System.out.println("DIgite o nome do titular da conta: ");
        String tit = sc.nextLine();
        
        //Inserir numero
        System.out.println("DIgite o numero da conta: ");
        String num = sc.nextLine();
        
        //Inserir agencia
        System.out.println("DIgite a agencia da conta: ");
        String agc = sc.nextLine();
        
        // nova instancia de contaBancaria
        contaBancaria conta = new contaBancaria(tit, num, agc);
        
        // while pra manter o menu na tela
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Sair");
            int opcao = sc.nextInt();
            
            switch (opcao) {
              
                case 1: // Depostia valor
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = sc.nextDouble(); 
                    conta.deposito(valorDeposito); //metodo deposito
                    break;
                case 2: // Saca valor
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = sc.nextDouble();
                    conta.saque(valorSaque); //metodo saque
                    break;
                case 3: // Busca infos da conta
                    System.out.println("Informações da Conta:");
                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Agência: " + conta.getAgencia());
                    System.out.println("Número: " + conta.getNumero());
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 4:  // encerra o menu
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;
                default: // qualquer outra coisa
                    System.out.println("Opção inválida. Tente novamente.");    
                    
            }
          
            
      
        }
    }
}

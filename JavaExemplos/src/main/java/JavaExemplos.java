
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author LabJF
 */
public class JavaExemplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        
    }
}

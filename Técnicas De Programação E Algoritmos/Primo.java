/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primo;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Primo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero inteiro: ");
        int Numero = scanner.nextInt();
        boolean primo = true;
        
        //Verificacoes
       if (Numero <= 1){
           System.out.println("O numero " +Numero+ " Nao e primo");
           
       } else {
        for (int i = 2; i <= Math.sqrt(Numero); i++) {
                if (Numero % i == 0) {
                    primo = false;
                    break; // achou um divisor → não é primo
       }
    }
}
    //Mostra o resultado
    if (primo) {
        System.out.println("O numero " + Numero + " e Primo");
    } else {
        System.out.println("O numero " + Numero + " nao e Primo");
    }

    }
}
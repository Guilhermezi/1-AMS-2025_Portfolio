/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadosimpares;
import java.util.Scanner;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author guilh
 */
public class SomaDosimpares {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        //dá nome ao scanner
        Scanner Sc = new Scanner(System.in);
        
        //entrada de valores
        System.out.println("Digite o valor inicial: ");
        int inicial = Sc.nextInt();
        
        System.out.println("Digite o valor final: ");
        int fim = Sc.nextInt();
        
        //Se incial for par, começa no próximo número, senão, começa nele mesmo
        int impar = (inicial % 2 == 0) ? inicial + 1 : inicial;
        
        int soma = 0;
        
        // soma de dois en dois até o fim
        while (impar <= fim) {
            soma += impar;
            impar += 2;
        }
        
        System.out.println("Soma dos ímpares entre " +inicial + " e " + fim + ": " + soma);
        
    }
}

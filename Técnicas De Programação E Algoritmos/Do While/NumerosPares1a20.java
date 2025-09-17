/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares1a20;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author guilh
 */
public class NumerosPares1a20 {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um número para verificarmos se é par: ");
        int num = scanner.nextInt();
        
        //definir a variavel como um
        int um = 1;
        int par = 2;
        
        // Enquanto for par, mostra a mensagem e sai
        while (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
            num = 1; // força sair do loop
        }

        // Enquanto for ímpar, mostra a mensagem e sai
        while (num % 2 != 0) {
            System.out.println("O número "+ num +" é ímpar.");
            num = 0; // força sair do loop
        }
        
            
        
            //Mostra somente os números pares de 1 a 20
        while (par <= 20) {
            System.out.println("O número " + par + " é par");
            
            par += 2;
        }
            
        //Enquanto o valor de um for menor ou igal a 20
        while (um <= 20) {
            // Se o número for par (resto da divisão por 2 igual a zero)
            if (um % 2 == 0) {
                System.out.println("O valor " + um + " É par");
            }
            // Se o número for impar irá mostrar isso:
            else {
                System.out.println("O valor " + um + " È impar" );
            }
            
            um += 1;
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros100.a125;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author guilh
 */
public class Numeros100A125 {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner Sc = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        //Pede número inicial
        System.out.println("Digite um número de 100 a 125: ");
        int inicio = Sc.nextInt();
        
        //pede número final
        System.out.println("Digite um número entre " + inicio + " a 125: ");
        int fim = Sc.nextInt();
        
        //definindo 100 e 125
        int cem = 100;
        int centoEvinteEcinco = 125;
        int contador2 = 0;
        int atual2 = cem;
        
        
        //definindo o contador e o número atual
        int contador = 0;
        int atual = inicio;
        
        //enquanto número atual for menor que o número final
        while (atual < fim) {
            contador += 1;
            atual += 1;
        }
        System.out.println("A quantidade de números entre " + inicio + " e " + fim + " é: " + contador);
        
        //Fazendo o total entre 100 e 125
        while (atual2 < centoEvinteEcinco) {
            contador2 += 1;
            atual2 += 1;
        }
        System.out.println("A quantidade de números entre 100 e 125 é: " + contador2);
        
        
        
        
    }
}

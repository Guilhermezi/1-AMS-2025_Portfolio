/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero para fazer a tabuada: ");
        double Numero = scanner.nextDouble();
        int Num = 2;
        
        for (double i = Numero; i <= (Numero) * 10; i++) {
            
            double Mult = Numero * Num;
            Num += 1;
            
            
            System.out.println(Mult);
            if (Num == 11) {break;}
        }
    }
}

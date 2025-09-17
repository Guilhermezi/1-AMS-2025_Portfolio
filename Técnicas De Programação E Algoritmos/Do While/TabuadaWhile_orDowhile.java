/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadawhile_ordowhile;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author guilh
 */
public class TabuadaWhile_orDowhile {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner Sc = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um número para ter a tabuada: ");
        int Tabuada = Sc.nextInt();
        int multiplicador = 1;
        
        do {
            //Exibe a multiplicação e o resultado, feito a conta no proprio print
            System.out.println(Tabuada + " X " + multiplicador + " = " + (Tabuada * multiplicador));
            multiplicador += 1; //incrementa o multiplicador    
        } while (multiplicador <= 10); //repete a multiplicação até o multiplicador ser maior que 10
            
        
    }
}

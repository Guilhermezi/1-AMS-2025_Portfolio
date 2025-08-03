/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;


/**
 *
 * @author Guilherme
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero: ");
        double Numero1 = scanner.nextDouble();
        System.out.println("Digite mais um numero: ");
        double Numero2 = scanner.nextDouble();
        
        //Operações
        double Soma = Numero1 + Numero2;
        double Subtracao = Numero1 - Numero2;
        double Multiplicacao = Numero1 * Numero2;
        double divisao = Numero1 / Numero2;
        
        
        //Mostra os resultados
        System.out.println("A Soma de: " +Numero1+ " + " +Numero2+ " = " + Soma);
        System.out.println("A Subtracao de: " +Numero1+ " + " +Numero2+ " = " + Subtracao);
        System.out.println("A Multiplicacao de: " +Numero1+ " + " +Numero2+ " = " + Multiplicacao);
        System.out.println("A divisao de: " +Numero1+ " + " +Numero2+ " = " + divisao);
    }
}

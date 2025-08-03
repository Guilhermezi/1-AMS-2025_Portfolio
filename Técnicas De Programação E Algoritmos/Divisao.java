/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisao;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite a temperatura em celsius: ");
        double Temperatura = scanner.nextDouble();
        
        //Conversor
        double Fahrenheit = Temperatura * 1.8 + 32;
        double Kelvin = Temperatura +273.15;
        
        
        System.out.println("Temperatura em fahrenheit = " + Fahrenheit);
        System.out.println("Temperatura em Kelvin = " + Kelvin);
        
    }
}

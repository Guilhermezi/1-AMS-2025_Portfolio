/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medianotas;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite uma das notas: ");
        double Nota = scanner.nextDouble();
        System.out.println("Digite mais uma nota: ");
        double Nota2 = scanner.nextDouble();
        System.out.println("Digite mais uma nota: ");
        double Nota3 = scanner.nextDouble();
        System.out.println("Digite mais uma nota: ");
        double Nota4 = scanner.nextDouble();
        
        double Soma = Nota + Nota2 + Nota3 + Nota4;
        double Divisao = Soma / 4;
        
        System.out.println("Sua media e: " +Divisao);
    }
}

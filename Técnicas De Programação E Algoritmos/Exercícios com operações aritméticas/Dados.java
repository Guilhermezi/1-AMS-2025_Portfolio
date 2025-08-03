/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dados;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Dados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite seu nome: ");
        String Nome = scanner.nextLine();
        
        System.out.println("Digite sua data de nascimento: ");
        String Nascimento = scanner.nextLine();
        
        System.out.println("Digite Seu Curso: ");
        String Curso = scanner.nextLine();
        
        System.out.println("Qual sua serie: ");
        String Serie = scanner.nextLine();
        
        System.out.println("Qual sua altura: ");
        double Altura = scanner.nextDouble();
        
        System.out.println("Qual seu Peso: ");
        double Peso = scanner.nextDouble();
        
        
        System.out.println("Ola " +Nome+ " Esses sao seus dados: Sua Data de nascimento: " +Nascimento+ ", O curso que esta cursando: " +Curso+ ", "
                + "a serie em que esta na escola: " +Serie+ ", Sua Altura: " +Altura+ ", Seu peso: " +Peso);
    }
}

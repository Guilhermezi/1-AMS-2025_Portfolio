/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class Semana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
         System.out.println("Digite um numero para me dizer qual o dia da semana");
         int Semana = scanner.nextInt ();
         
         switch (Semana) {
            case 1:
                 System.out.println("O dia da semana e: Domingo");
                 break;
            case 2:
                System.out.println("O dia da semana é: Segunda");
                break;
            case 3:
                System.out.println("O dia da semana é: Terça");
                break;
            case 4:
                System.out.println("O dia da semana é: Quarta");
                break;
            case 5:
                System.out.println("O dia da semana é: Quinta");
                break;
            case 6:
                System.out.println("O dia da semana é: Sexta");
                break;
            case 7:
                System.out.println("O dai da semana é: Sabado");
                break;
            
            default:
                System.out.println("O numero digitado não corresponde a nenhum dia");
                break;
         }
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author guilh
 */
public class Idade {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero inteiro para Definir sua faixa etária");
        int idade = scanner.nextInt();
        
        //determina o código da faixza etária usando o if e else
        int faixa;
            if (idade >= 0 && idade <= 12) {
                faixa = 1; //criança
            }
            else if (idade >=13 && idade <= 17) {
                faixa = 2; //adolescente
            }
            else if (idade >=18 && idade <=59){
                faixa = 3; //adulto
            }
            else if (idade >= 60) {
                faixa = 4; // idoso
            } 
            else {
            faixa = 0; // idade inválida
            }
        
        switch (faixa) {
            case 1:
                System.out.println("Você é uma criança vá brincar");
                break;
            case 2:
                System.out.println("Você é um adolescente vai estudar");
                break;
            case 3:
                System.out.println("Você é um adulto, vai trabalhar");
                break;
            case 4:
                System.out.println("Você é um idoso, vá descansar");
                break;
                
            default:
                System.out.println("Você é um espírito. Como está usando um PC?😨");
                break;
        }
    }
}

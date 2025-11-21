/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz4x4;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Matriz4X4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Criando e definindo a quantidade de linhas e colunas das metrizes A e B
        int [][]A = new int [4][4];
        
        int somaPares = 0;
        int contadoresPares = 0;
        
        //pedindo os números para cada linha e coluna do matriz A
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                System.out.println("Digite um numero: ");
                A[i][j] = sc.nextInt();
                
                //Verificando se o número é par
                if (A[i][j] % 2 == 0) {
                    somaPares += A[i][j];
                    contadoresPares++;
                }
            }
        }
        
        //Média
        double media = somaPares / contadoresPares;
        
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Media dos pares: " + media);
        
        
    }
}

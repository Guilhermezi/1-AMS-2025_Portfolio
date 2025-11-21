/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz_5x5_inteiros;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Matriz_5X5_Inteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M = new int[5][5];

        int somaImpares = 0;
        int[] somaLinhas = new int[5];
        int[] somaColunas = new int[5];

        // Leitura da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Digite um numero coluna " + i + "linha " + j + " :");
                M[i][j] = sc.nextInt();

                // soma dos ímpares
                if (M[i][j] % 2 != 0) {
                    somaImpares += M[i][j];
                }

                // soma das linhas
                somaLinhas[i] += M[i][j];

                // soma das colunas
                somaColunas[j] += M[i][j];
            }
        }

        // a) soma dos ímpares
        System.out.println("\nSoma dos impares: " + somaImpares);

        // b) soma das 5 colunas
        System.out.println("\nSoma das colunas: ");
        for (int c = 0; c < 5; c++) {
            System.out.println("Coluna " + (c+1) + ": " + somaColunas[c]);
        }

        // c) soma das 5 linhas
        System.out.println("\nSoma das linhas: ");
        for (int l = 0; l < 5; l++) {
            System.out.println("Linha " + (l+1) + ": " + somaLinhas[l]);
        }
    }
}
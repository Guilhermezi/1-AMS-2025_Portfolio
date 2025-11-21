/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

/**
 *
 * @author guilh
 */
public class Matrizes {

    public static void main(String[] args) {
        //Criando e definindo a quantidade de linhas e colunas das metrizes A
        String[][] A = {
            {"a", "b", "c", "d", "e"},
            {"f", "g", "h", "i", "j"},
            {"l", "m", "n", "o", "p"},
            {"q", "r", "s", "t", "u"},
        };
        
        //mostra as letras
        for (int i = 0; i < A.length; i++) {         
            for (int j = 0; j < A[i].length; j++) {  
            System.out.print(A[i][j] + "\t");    // imprime na mesma linha
            }
                System.out.println(); // quebra a linha ao final de cada linha da matriz
        }
        
        
        //Criando e definindo a quantidade de linhas e colunas das metrizes B
        int[][] B = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74},
        };
        
        System.out.println();
        
        //mostra as letras
        for (int i = 0; i < B.length; i++) {         
            for (int j = 0; j < B[i].length; j++) {  
            System.out.print(B[i][j] + "\t");    // imprime na mesma linha
            }
                System.out.println(); // quebra a linha ao final de cada linha da matriz
        }
        
        //Criando e definindo a quantidade de linhas e colunas das metrizes B
        double [][] C = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7},
        };
        
        System.out.println();
        
        //mostra as letras
        for (int i = 0; i < C.length; i++) {         
            for (int j = 0; j < C[i].length; j++) {  
            System.out.print(C[i][j] + "\t");    // imprime na mesma linha
            }
                System.out.println(); // quebra a linha ao final de cada linha da matriz
        }
    }
}

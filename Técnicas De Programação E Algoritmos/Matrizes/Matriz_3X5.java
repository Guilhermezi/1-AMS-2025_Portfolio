/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz_3x5;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class Matriz_3X5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[][] M = new int[3][5];

        int qtdPares = 0;
        int qtdImpares = 0;
        boolean repetido = false;

        // --- Preencher a matriz ---
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Digite um numero: ");
                M[i][j] = sc.nextInt();

                // pares e ímpares
                if (M[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        // --- Verificar repetidos ---
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {

                        // evita comparar posição com ela mesma
                        if (!(i == x && j == y)) {

                            if (M[i][j] == M[x][y]) {
                                repetido = true;
                                break;
                            }

                        }
                    }
                }
            }
        }

        // --- Resultados ---
        System.out.println("\nA) Possui elementos repetidos? " 
                           + (repetido ? "SIM" : "NÃO"));

        System.out.println("B) Quantidade de pares: " + qtdPares);

        System.out.println("C) Quantidade de impares: " + qtdImpares);
    }
}
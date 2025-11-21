/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz4x4decimais;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Matriz4X4Decimais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[][] M = new float[4][4];

        // Preencher a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero decimal: ");
                M[i][j] = sc.nextFloat();
            }
        }

        // a) Diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(M[i][i]);
        }

        // b) Diagonal secundária
        System.out.println("\nDiagonal Secundaria:");
        for (int i = 0; i < 4; i++) {
            System.out.println(M[i][3 - i]);
        }
    }
}
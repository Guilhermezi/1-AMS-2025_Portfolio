/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figura;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Figura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        System.out.println("Escolha a figura:");
        System.out.println("a) Quadrado com bordas");
        System.out.println("b) Quadrado aberto em cima");
        System.out.println("c) Letra L");
        System.out.print("Opcao: ");
        opcao = sc.next().toLowerCase().charAt(0);

        switch (opcao) {
            case 'a':
                figuraA();
                break;

            case 'b':
                figuraB();
                break;

            case 'c':
                figuraC();
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    // ===================== FIGURA A =====================
    public static void figuraA() {
        char[][] M = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 0 || i == 4 || j == 0 || j == 4)
                    M[i][j] = '*';
                else
                    M[i][j] = ' ';

                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ===================== FIGURA B =====================
    public static void figuraB() {
        char[][] M = new char[4][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {

                if (j == 0 || j == 5)
                    M[i][j] = '*';          // laterais
                else if (i == 3)
                    M[i][j] = '*';          // base
                else
                    M[i][j] = ' ';

                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ===================== FIGURA C =====================
    public static void figuraC() {
        char[][] M = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (j == 0)
                    M[i][j] = '*';         // coluna esquerda
                else if (i == 4)
                    M[i][j] = '*';         // linha inferior
                else
                    M[i][j] = ' ';

                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}
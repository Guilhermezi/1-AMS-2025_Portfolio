/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //Ler uma linha de texto, e pedir uma linha de texto
         System.out.println("Digite um numero para me dizer qual seu jogo favorito");
         int jogo = scanner.nextInt ();
         
         switch (jogo) {
            case 1, 2 -> System.out.println("O jogo correspondente é Minecraft");
            case 3, 4 -> System.out.println("O jogo correspondente é Limbo");
            case 5, 6 -> System.out.println("O jogo correspondente é GTA 5");
            case 7, 8 -> System.out.println("O jogo correspondente é CS GO 2");
            case 9, 10 -> System.out.println("O jogo correspondente é R.E.P.O");
             
            default -> System.out.println("O numero que vc digitou nao corresponde a nenhum jogo");
         }
         
    }
}

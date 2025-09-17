/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruta;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class Fruta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero:");
        int fruta = scanner.nextInt();
        //tomada de decisao com switch, que diminui o codigo com muitas linhas
        
        switch (fruta){
            case 1:
                System.out.println("O numero corresponde a fruta Maca");
                break;
            case 2:
                System.out.println("O numero corresponde a fruta Banana");
                break;
            case 3:
                System.out.println("O numero corresponde a fruta Laranja");
                break;
            
            default:
                System.out.println("O numero e invalido, tente de novo com numeros de 1 a 3");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraynumeros1a100impar;

/**
 *
 * @author Admin
 */
public class ArrayNumeros1a100Impar {

    public static void main(String[] args) {
        int [] numeros = new int [101];
        
        //mostra os númeors de 1 a 100:
        for (int i = 0; i < numeros.length; i++){
            if (i % 2 == 0) {
                System.out.println("\npar " + i + "; ");
        }
            else {
                System.out.println("\nimpar " + i + "; ");
        }
        }
    }
}

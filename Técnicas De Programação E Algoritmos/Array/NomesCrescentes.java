/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomescrescentes;
import java.util.Scanner;
import java.util.Arrays; // importa a classe Arrays para ordenar
import java.util.Collections;


/**
 *
 * @author Admin
 */
public class NomesCrescentes {

    public static void main(String[] args) {
        //Chama o Scanner para dentro do código e apelida de sc
         Scanner sc = new Scanner(System.in);
        
         //define o array com o tamanho de 5
        String[] Nomes = new String[5];
        
        // Entrada dos nomes
        for (int i = 0; i < Nomes.length; i++) {
            System.out.print("Digite o nome da posição " + i + ": ");
            Nomes[i] = sc.nextLine();
        }
        
        // Ordena os nomes em ordem alfabética
        Arrays.sort(Nomes);
        
        // Mostra o resultado
        System.out.println("\nNomes em ordem alfabética Crescente:");
        for (String nome : Nomes) {
            System.out.println(nome);
        }
        
        //Em decrescente:
        
        // Cria um vetor de 5 nomes
        // Converte o vetor em lista para usar Collections
        var listaNomes = Arrays.asList(Nomes);

        // Inverte a ordem da lista
        Collections.reverse(listaNomes);

        // Mostra os nomes em ordem decrescente
        System.out.println("\nNomes em ordem alfabética Decrescente:");
        for (String nome : Nomes) {
            System.out.println(nome);
        }
    }
}

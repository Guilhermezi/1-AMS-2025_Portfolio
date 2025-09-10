/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite a sua nota na prova com numeros inteiros: ");
        int nota = scanner.nextInt();
        //tomada de decisao com switch, que diminui o codigo com muitas linhas
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                //Mostra a nota do aluno com base na quantidade de questoes que ele acertou
                System.out.println("A sua nota é I");
                break;
            case 5:
            case 6:
                //Mostra a nota do aluno com base na quantidade de questoes que ele acertou
                System.out.println("A sua nota é R");
            break;
            case 7:
            case 8:
                //Mostra a nota do aluno com base na quantidade de questoes que ele acertou
                System.out.println("A sua nota é B");
            break;
            case 9:
            case 10:
                //Mostra a nota do aluno com base na quantidade de questoes que ele acertou
                System.out.println("A sua nota é MB");
                //Mostra ao usuario que o numero digitado nao e valido
            default:
                System.out.println("insira um numero valido de 1 a 10, sem casas decimais");
            }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarifastransporte;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author guilh
 */
public class TarifasTransporte {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero inteiro para escolher o tipo de transporte: ");
        int Numero = scanner.nextInt();
        //DEcidindo qual o transporte escolhido
        switch (Numero) {
            case 1:
                System.out.println("O transporte escolido pelo número " + Numero + " é o ônibus urbano");
                
                //pedindo a quantidade de bilhetes para calcular o preco a ser pago
                System.out.println("Qual a quantidade de bibletes: ");
                int Bilhetes1 = scanner.nextInt();
                
                //contas:
                double onibusUrbano = Bilhetes1 * 4.40;
                
                //mostrando o preco
                System.out.println(Bilhetes1 + " de bilhetes custam: " + onibusUrbano);
                break;
            case 2:
                System.out.println("O transporte escolido pelo número " + Numero + " é o Metrô");
                
                //pedindo a quantidade de bilhetes para calcular o preco a ser pago
                System.out.println("Qual a quantidade de bibletes: ");
                int Bilhetes2 = scanner.nextInt();
                
                //contas:
                double Metro = Bilhetes2 * 5.00;
                
                //mostrando o preco
                System.out.println(Bilhetes2 + " de bilhetes custam: " + Metro);
                break;
            case 3:
                System.out.println("O transporte escolido pelo número " + Numero + " é o Trem Intermunicipal");
                
                //pedindo a quantidade de bilhetes para calcular o preco a ser pago
                System.out.println("Qual a quantidade de bibletes: ");
                int Bilhetes3 = scanner.nextInt();
                
                //contas:
                double Trem = Bilhetes3 * 6.50;
                
                //mostrando o preco
                System.out.println(Bilhetes3 + " de bilhetes custam: " + Trem);
                break;
            case 4:
                System.out.println("O transporte escolido pelo número " + Numero + " é o ônibus rodoviário");
                
                //pedindo a quantidade de bilhetes para calcular o preco a ser pago
                System.out.println("Qual a quantidade de bibletes: ");
                int Bilhetes4 = scanner.nextInt();
                
                //contas:
                double Rodoviario = Bilhetes4 * 12.00;
                
                //mostrando o preco
                System.out.println(Bilhetes4 + " de bilhetes custam: " + Rodoviario);
                break;
            
            //caso nenhum dos casos se encaixe
            default:
                System.out.println("O número inserido é invalido tente novamente");
                break;
        }
        
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author guilh
 */
public class Banco {

    public static void main(String[] args) {
        //Força a saída no console em UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);
        //Ler uma linha de texto, e pedir uma linha de texto
        System.out.println("Digite um numero inteiro para escolher como irá usar o Banco: 1 para consultar saldo, 2 para sacar dinheiro, 3 para depositar dinheiro e 4 para encerrar o atendimento ");
        int Banco = scanner.nextInt();
        
        //decidindo como irá usar o banco:
        switch (Banco) {
            case 1:
                int Certeza;
                //usando do while para reiniciar o código caso a condição não seja aplicada, e fazer o código rodar ao menos uma vez
                do {
                    System.out.println("A ação feita pelo número " + Banco + " é consultar saldo.");
                    System.out.println("Tem certeza que deseja continuar?");
                    System.out.print("Digite 1 para SIM ou 2 para NÃO: ");
                    Certeza = scanner.nextInt();

                        if (Certeza == 1) {
                            System.out.println("Seu saldo é R$ 1000,00.");
                        } 
                        else if (Certeza == 2) {
                            System.out.println("Operação cancelada.");
                        } 
                        else {
                            System.out.println("Opção inválida, tente novamente.");
                        }
                            } while (Certeza != 1 && Certeza != 2); 
            break;
            case 2:
                int Certeza2;
                do {
                    System.out.println("A ação feita pelo número " + Banco + " é Sacar dinheiro.");
                    System.out.println("Tem certeza que deseja continuar?");
                    System.out.print("Digite 1 para SIM ou 2 para NÃO: ");
                    Certeza2 = scanner.nextInt();
                    
                        if (Certeza2 == 1) {
                            double saldo = 1000.00;
                            System.out.println("Quanto deseja Sacar?");
                            double Valorsaque = scanner.nextDouble();
                            
                                if (Valorsaque > saldo) {
                                    System.out.println("O saldo da conta é insuficiente");
                                }
                                else {
                                    System.out.println("Saque aprovado");
                                }
                        }
                        else if (Certeza2 == 2) {
                            System.out.println("Operação cancelada");
                        
                        } 
                        else {
                            System.out.println("Opção inválida, tente novamente.");
                        }
                            } while (Certeza2 != 1 && Certeza2 != 2);
                break;
            case 3:
                int Certeza3;
                do {
                    System.out.println("A ação feita pelo número " + Banco + " é Depositar dinheiro.");
                    System.out.println("Tem certeza que deseja continuar?");
                    System.out.print("Digite 1 para SIM ou 2 para NÃO: ");
                    Certeza3 = scanner.nextInt();
                    
                        if (Certeza3 == 1) {
                            double saldo = 1000.00;
                            System.out.println("Quanto deseja Depositar?");
                            double Valordeposito = scanner.nextDouble();
                            System.out.println("O novo valor na conta após o deposito é: " + (Valordeposito + saldo));
                            
                        }
                        else if (Certeza3 == 2) {
                            System.out.println("Operação cancelada");
                        
                        } 
                        else {
                            System.out.println("Opção inválida, tente novamente.");
                        }
                            } while (Certeza3 != 1 && Certeza3 != 2);
                break;
            case 4:
                int Certeza4;
                do {
                    System.out.println("A ação feita pelo número " + Banco + " é Encerrar o atendimento.");
                    System.out.println("Tem certeza que deseja continuar?");
                    System.out.print("Digite 1 para SIM ou 2 para NÃO: ");
                    Certeza4 = scanner.nextInt();
                    
                    if (Certeza4 == 1){
                        System.out.println("Atendimento cancelado.");
                    }
                    else if (Certeza4 == 2) {
                        System.out.println("certo vamos continuar com o atendimento:");
                    }
                    else {
                        System.out.println("Opção invalida, tente novamente.");
                    } 
                }while (Certeza4 != 1 && Certeza4 != 2);
                break;
                
            default:
                System.out.println("Vc não sabe oque está fazendo né");
                break;
                
        }
    }
}

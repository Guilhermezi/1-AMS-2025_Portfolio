/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura_de_decisao;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Estrutura_De_Decisao {

    public static void main(String[] args) {
        //Premeira estrutura de decisão
        //Mostra uma caixa de menssagem para colocar um número, e define a variável
        int Livros = Integer.parseInt(JOptionPane.showInputDialog("Quantos livros você leu esse ano? "));
        
        //Estrutura de decisão
        if (Livros > 4) {
            JOptionPane.showMessageDialog(null, "Você está no caminho para ser um leitor de respeito, continue assim");
        }// Verifica se o número digitado na variável é maior a 4, se for, ele mostra uma menssagem.
        
        else { 
            JOptionPane.showMessageDialog(null, "Você é realmente um cidadão do Bostil");
        }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
        
        
        //Segunda estrutura de decisão
        //Mostra uma caixa de diálogo e pergunta quantas lasanhas (Carros antigos) a pessoa tem
        int Carros = Integer.parseInt(JOptionPane.showInputDialog("Quantas Lasanhas você tem"));
        
        //Estrutura de decisão
        if (Carros == 1) {
            JOptionPane.showMessageDialog(null, "Dá Para ser feliz e sem dor de cabeça");
        }// Verifica se o número digitado na variável é igua a 1, se for, ele mostra essa menssagem

        else {
            JOptionPane.showMessageDialog(null, "Ter, essa quantidade de carros é perigoso");
        }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
        
        
        
       //Terceira estrutura de decisão
       //Mostra uma caixa de diálogo e pergunta quantas rodas o carro da pessoa tem
       int rodas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas rodas tem seu carro"));
       
       //Estrutura de decisão
       if (rodas != 4) {
           JOptionPane.showMessageDialog(null, "Parece que você não tem um carro");
       }// Verifica se o número digitado na variável é diferente de 4, se for, ele mostra essa menssagem
       
       else {
           JOptionPane.showMessageDialog(null, "Você provavelmente tem um carro");
       }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
       
       
       //Quarta estrutura de decisão
       //Mostra uma caixa de diálogo e pergunta quantos Anos a pessoa tem
       int Idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos anos você tem?"));
       
       //Estrutura de decisão
       if (Idade < 18) {
           JOptionPane.showMessageDialog(null, "Você é menor de idade");
       }// Verifica se o número digitado na variável é menor que 18, se for, ele mostra uma menssagem.
       
       else {
           JOptionPane.showMessageDialog(null, "Você é maior de idade");
       }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
       
       
       //Quinta estrutura de decisão
       //definindo variáveis
       double Preco = 120.50;
       
       
       //Mostra uma caixa de diálogo e pergunta qual o saldo da conta da pessoa
       double Saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o Saldo da sua conta?"));
       
       //Estrutura de decisão
       if (Saldo >= Preco) {
           JOptionPane.showMessageDialog(null,"Compra aprovada");
       }// Verifica se o número digitado na variável é maior ou igual ao preço do produto, se for, ele mostra uma menssagem.
       
       else {
           JOptionPane.showMessageDialog(null,"Saldo insuficiente para a compra");
       }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
       
    
       //Sexta estrutura de decisão
       //Mostra uma caixa de diálogo e pergunta qual o saldo da conta da pessoa
       int temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a temperatura atual em °C?"));

       if (temperatura <= 18) {
            JOptionPane.showMessageDialog(null, "Temperatura baixa! Ligando o aquecedor...");
        }// Verifica se o número digitado na variável é menor ou igual a 18, se for, ele mostra uma menssagem.     
       
       else {
            JOptionPane.showMessageDialog(null, "Temperatura agradável. Aquecedor desligado.");
        }// Caso a última verificação não seja verdadeira, o código irá executar essa caixa de menssagem
    }
}

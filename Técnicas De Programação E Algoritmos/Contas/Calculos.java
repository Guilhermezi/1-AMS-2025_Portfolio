/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calculos {

    public static void main(String[] args) {
        
        double num1 = 10.75; //comporta numeros com duas casas apos a virgula   
        double num2 = 40.98;
        double Pi = 3.14;
        int Quadrado = 6; // números inteiros 
        int AlturaRetangulo = 5;
        int BaseRetangulo = 8;
        int BaseTriangulo = 9;
        int AlturaTriangulo = 5;
        int Diagonal = 10;
        int Diagonal_2 = 2;
        int Raio = 5;
                
            //calculos
        double Soma = num1 + num2;
        double Subtracao = num1 - num2;
        double Multiplicacao = num1 * num2;
        double Divisao = num2 != 0 ? num1 /num2 : Double.NaN; //!= diferente de, exmplo num2 != 0 ? 
        double Resto = num1 % num2;
        double Media = Soma / 2;
        int Area = Quadrado * Quadrado;
        int AreaRetangulo = AlturaRetangulo * BaseRetangulo;
        int AreaTriangulo = BaseTriangulo * AlturaTriangulo / 2;
        int AreaLosango = Diagonal * Diagonal_2 /2;   
        double AreaCircunferencia = Raio * Raio * Pi;
        
        
        
        //Mostrar na tela o valor dos calculos
        System.out.println("A soma: "+ Soma);
        System.out.println("A Subtracao: "+ Subtracao);
        System.out.println("A Multiplicacao: "+ Multiplicacao);
        System.out.println("A Divisao: "+ Divisao);
        System.out.println("o Resto: "+ Resto);
        System.out.println("A Media: "+ Media);
        System.out.println("A area do Qudrado: "+ Area);
        System.out.println("A area do Retangulo: "+ AreaRetangulo);
        System.out.println("A area do Triangulo: "+ AreaTriangulo);
        System.out.println("A area do Losango: "+ AreaLosango);
        System.out.println("A area do Circunferencia: "+ AreaCircunferencia);

        
        
        
    }
}

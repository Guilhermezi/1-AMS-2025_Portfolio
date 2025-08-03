/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mediadenumeros;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class MediaDeNumeros {

    public static void main(String[] args) {
        //Mostrar e definir Os números que serão usados na média
        JOptionPane.showMessageDialog(null, "Os números que serão usados para fazer a média serão: 8,9,7");
        int Numero1ParaMedia1 = 8;
        int Numero2ParaMedia1 = 9;
        int Numero3ParaMedia1 = 7;
        
        JOptionPane.showMessageDialog(null, "Os números que serão usados para fazer a segunda média serão: 4,5,6");
        int Numero1ParaMedia2 = 4;
        int Numero2ParaMedia2 = 5;
        int Numero3ParaMedia2 = 6;
        
        //Fazendo as contas:
        //Para a Média 1
        int SomaMedia1 = Numero1ParaMedia1 + Numero2ParaMedia1 + Numero3ParaMedia1;
        int Media1 = SomaMedia1 / 3;
        //Para a Média 2
        int SomaMedia2 = Numero1ParaMedia2 + Numero2ParaMedia2 + Numero3ParaMedia2;
        int Media2 = SomaMedia2 / 3;
        //Soma das médias
        int SomaDasMedias = SomaMedia1 + SomaMedia2;
        //Média Das Médias
        int MediaDasMedias = SomaDasMedias / 2;
        
        //Mostrando Tudo:
        JOptionPane.showMessageDialog(null, "A média dos números 8,9 e 7 é: " + Media1);
        JOptionPane.showMessageDialog(null, "A média dos números 4,5 e 6 é: " + Media2);
        JOptionPane.showMessageDialog(null,"A Soma Das Médias É: " + SomaDasMedias);
        JOptionPane.showMessageDialog(null, "A média das Médias é: " + MediaDasMedias);
        
    }
}

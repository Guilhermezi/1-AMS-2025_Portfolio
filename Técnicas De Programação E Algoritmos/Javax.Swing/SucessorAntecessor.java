/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessorantecessor;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class SucessorAntecessor {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")); //Mostra uma caixa de menssagem para colocar um numero
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        
        JOptionPane.showMessageDialog(null, "O numero digitado foi: " + numero); //mostra o que foi colocado no input
        JOptionPane.showMessageDialog(null, "O sucessor do número digitado é: " + sucessor); 
        JOptionPane.showMessageDialog(null, "O antecessor do número digitado é: " + antecessor);
    }
}

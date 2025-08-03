/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustede1por100;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ReajusteDe1Por100 {

    public static void main(String[] args) {
        //Perguntas
        int Saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo aleatorio: "));
        
        //Calculos
        double Ajuste = Saldo * 0.01;
        double Final = Ajuste + Saldo;
        
        JOptionPane.showMessageDialog(null, "O Valor com um ajuste de 1% é: " + Final);
        JOptionPane.showMessageDialog(null, "O Valor do ajuste de 1% é: " + Ajuste);
        
        
    }
}

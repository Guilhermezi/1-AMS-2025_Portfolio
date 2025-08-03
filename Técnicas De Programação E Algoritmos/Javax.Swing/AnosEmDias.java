/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.anosemdias;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class AnosEmDias {

    public static void main(String[] args) {
        //Pedir A idade:
        int IdadeAno = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos: "));
        int IdadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em Meses: "));
        int IdadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em dias: "));
        
        //Fazer a Conta Para saber a idade inteiramente em dias,
        int TotalIdadeDias = IdadeAno * 365 + IdadeMeses *30 + IdadeDias;
        
        //Mostra a idade em dias na interface Gráfica
        JOptionPane.showMessageDialog(null, "Sua Idade em dias é: " + TotalIdadeDias);
        
    }
}

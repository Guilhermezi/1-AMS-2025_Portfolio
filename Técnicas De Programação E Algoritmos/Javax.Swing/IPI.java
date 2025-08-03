/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipi;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IPI {

    public static void main(String[] args) {
        //Perguntas
        int IPI = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor do IPI: ")); //Mostra uma caixa de menssagem para colocar um numero
        
        int Peca_um = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça um: ")); 
        int numeroDePecas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de peças um: ")); 
        int ValorDaPecaUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor das peças um: "));
        
        int Peca_dois = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça Dois: ")); 
        int numeroDePecasDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de peças dois: "));
        int ValorDaPecadois = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor das peças dois: "));
        
        
        //Calculos
        double Valorpecas = (ValorDaPecaUm * numeroDePecas + ValorDaPecadois * numeroDePecasDois) * (IPI / 100 + 1);
        
        //Mostrando
        JOptionPane.showMessageDialog(null, "O valor das peças é: " + Valorpecas);
        JOptionPane.showMessageDialog(null, "O código da peça dois é:: " + Peca_um);
        JOptionPane.showMessageDialog(null, "O código da peça um é: " + Peca_dois);
        
        
        
    }
}

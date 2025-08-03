/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarios;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Salarios {

    public static void main(String[] args) {
        //Pergunta
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salário: "));
        
        //Calculos
        double salarios = salario / 1000;
        
        //Mostrando
        JOptionPane.showMessageDialog(null, "O salário é :" + salario);
        JOptionPane.showMessageDialog(null, "O você ganha: " + salarios + "Salários mínimos");
        
        
    }
}

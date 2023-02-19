/*
Receba o valor de um depósito em poupança. Calcule e mostre o valor 
após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeq08 {
    public static void main (String args[]){
        double deposito, aplicado;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: R$"));
        aplicado = deposito * 1.13;
        
        JOptionPane.showMessageDialog(null, "Após 1 mês o valor em conta será: R$ " + aplicado);
    }

}

/*
Exercício 24: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3

Programadora: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;

public class Pgr_EstDec24 {
    public static void main (String args []){
        int valor;
        double resto3, resto2;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        
        resto2 = valor % 2;
        resto3 = valor % 3;
        
        if (resto2 == 0 && resto3 == 0){
            JOptionPane.showMessageDialog(null, valor + " é divisível por 2 e 3");
        } else {
            if (resto2 == 0){
                JOptionPane.showMessageDialog(null, valor + " é divisível apenas por 2");
            } else {
                if (resto3 == 0){
                    JOptionPane.showMessageDialog(null, valor + " é divisível apenas por 3");
                } else {
                    JOptionPane.showMessageDialog(null, valor + " não é divisível nem por 2 nem por 3");
                } 
            }
        }
    }
}

/*
Exercício 22: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem 
crescente.

Programadora: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstDec22 {
    public static void main (String args []){
    int val1, val2;
    
    val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    
        if (val1 > val2){
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + val2 + ", " + val1);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + val1 + ", " + val2);
        }
    }
    
}

/*
Exercício 19: Receba 2 valores reais. Calcule e mostre o maior deles

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;

import javax.swing.JOptionPane;
public class Pgr_EstDec19 {
    public static void main (String args []){
        double valor1, valor2, maior;
        
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));  
        
        if (valor1 > valor2){
            maior = valor1;
        } else {
            maior = valor2;
        }
        
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
    
}

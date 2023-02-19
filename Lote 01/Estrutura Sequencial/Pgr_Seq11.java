/*
Exercício 11: Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferênciaReceba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência

Programadora: Bianca S.

Data: 16/02/2023
 */

package aula1602;

import javax.swing.JOptionPane;
public class Pgr_Seq11 {
    public static void main (String args []){
        
        double raio, circunferencia;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da circunferência:  "));
        
        circunferencia = (2*3.14*raio);
        
        JOptionPane.showMessageDialog(null, "O valor da circunferência é: " + circunferencia);
    }
}

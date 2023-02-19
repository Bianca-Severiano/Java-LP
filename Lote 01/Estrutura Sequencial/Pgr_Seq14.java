/*
Exercício 14: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;

import javax.swing.JOptionPane;

public class Pgr_Seq14 {
    public static void main (String args []){
        double angulo1, angulo2, angulo3;
        
        angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo 1: "));
        angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo ângulo: "));
        angulo3 = (180 - (angulo1 + angulo2));
        
        JOptionPane.showMessageDialog(null, "O terceiro ângulo vale: " + angulo3);
        
    }
}

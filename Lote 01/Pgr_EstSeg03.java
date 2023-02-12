/*
Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

Programadora: Bianca S.

12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeg03 {
    public static void main (String args []){
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        
        area = ((base*altura)/2);
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}

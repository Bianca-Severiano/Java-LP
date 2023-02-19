/*
Receba os coeficientes A, B e C de uma equação do 2º grau 
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a 
equação possui 2 raízes)
Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeq05 {
    public static void main (String args[]){
        double a, b, c, delta, x1, x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        delta = ((b*b)-(4*a*c));
        x1 = ((-b - (Math.sqrt(delta)))/2*a);
        x2 = ((-b + (Math.sqrt(delta)))/2*a);
        
        JOptionPane.showMessageDialog(null, "As raízes da equação são: X1 =" + x1 + " e X2 = " + x2);
        
    }

}

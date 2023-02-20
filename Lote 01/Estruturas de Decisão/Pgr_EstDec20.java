/*
Exercício 20: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Pgr_EstDec20 {
    public static void main (String args[]){
        int a, b, c;
        double delta, x1, x2;       
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente c: "));
        
        delta = (((Math.pow(b,2))-(4 * a * c)));
        
        if (delta >= 0){
            JOptionPane.showMessageDialog(null, "A equação possui ao menos 1 raíz real");
            
            delta = (Math.sqrt(delta));
            
            x1 = (((b*(-1)) + delta)/(2*a));
            x2 = (((b*(-1)) - delta)/(2*a));
            
            JOptionPane.showMessageDialog(null, "X' = " + x1 + " X'' = " + x2);
             
        } else {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais");
        }
               
    }
}

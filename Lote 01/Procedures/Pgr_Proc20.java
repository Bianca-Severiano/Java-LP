
/*Exercício 20: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.

Programadoura: Bianca S.
Data: 09/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc20 {
    static int a, b, c;
    public static void main (String args[]){
        EntradaValores();
    }
    
    // Recebe valores
    static void EntradaValores(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        Raizes(a,b,c);
    }
        
    // Calcula Delta e informa se há raízes reais
    static void Raizes(int a, int b, int c){
        double delta;
        delta = (((Math.pow(b,2))-(4 * a * c)));
        
        if (delta < 0 ){
            JOptionPane.showMessageDialog(null, "Equação não possui raízes reais");
        } else {
            CalcRaizes(delta);
        }
    }
    
    // Realiza o cálculo de X
    static void CalcRaizes(double delta){
            double x1, x2;
            delta = (Math.sqrt(delta));
            
            x1 = (((b*(-1)) + delta)/(2*a));
            x2 = (((b*(-1)) - delta)/(2*a));
            
            JOptionPane.showMessageDialog(null, "As raízes da equação são: "+ x1 + " e " + x2);
    }
}

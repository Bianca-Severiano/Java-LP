/*Exercício 33: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

Programadora: Bianca S.
Data: 23/02/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep33 {
    public static void main (String Args[]){
       
        double resultado, numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        
        resultado = 0;
        
        for (double i = 1; i <= numero; i ++){
                resultado = (resultado + (1/i));
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + resultado);
    }
}

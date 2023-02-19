/*
Exercício 18: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menor valor.

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;
import javax.swing.JOptionPane;
public class Pgr_Seq18 {
    public static void main (String args []){
        int valor1, valor2, diferenca;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));  
        
        if (valor1 > valor2){
            diferenca = valor1 - valor2;
        } else {
            diferenca = valor2 - valor1;
        }
        
        JOptionPane.showMessageDialog(null, "A diferença do valor maior pelo menor é: " + diferenca );
    }
}

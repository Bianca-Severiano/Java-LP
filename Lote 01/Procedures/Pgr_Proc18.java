/*Exercício 18:  Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menos valor.

Programadoura: Bianca S.
Data: 02/03/2023
 */
import javax.swing.JOptionPane;
public class Pgr_Proc18 {
    public static void main (String args []){
        ReceberValores();
    }
    
    // Receber valores
    static void ReceberValores(){
        int valor1, valor2;        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        CalcDiferenca(valor1, valor2);
    }
    
    // Calcular diferença
    static void CalcDiferenca(int valor1, int valor2){
        int diferenca;        
        if (valor1 > valor2){
            diferenca = valor1 - valor2;
        } else {
            diferenca = valor2 - valor1;
        }
        
        JOptionPane.showMessageDialog(null, "Diferença: " + diferenca);
    }
}

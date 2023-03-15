/*Exercício 19: Receba 2 valores reais. Calcule e mostre o maior deles.

Programadoura: Bianca S.
Data: 02/03/2023
 */
import javax.swing.JOptionPane;
public class Pgr_Proc19 {
    static double maior;
    
    public static void main (String Args[]){
        double valor1, valor2;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        VerificaMaior(valor1, valor2);
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
    }
    
    // Verifica maior 
    static void VerificaMaior(double v1, double v2){
        if (v1 > v2){
            maior = v1;
        } else {
            maior = v2;
        }
    }
}

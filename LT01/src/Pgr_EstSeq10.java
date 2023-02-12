/*
Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programadora: Bianca S.
12/02/2023
*/
import javax.swing.JOptionPane;
public class Pgr_EstSeq10 {
    public static void main (String args []) {
    
        double a, b, diferenca;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        diferenca = a - b;
        
        JOptionPane.showMessageDialog(null, "A diferença dos valors é " + diferenca);
    }
}

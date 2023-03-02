
import javax.swing.JOptionPane;

/*Exercício 36: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

Programadora: Bianca S.
Data: 23/02/2023
 */
public class Pgr_EstRep36 {
    public static void main(String[] args) {
        double N, fatorial, serie;
        
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        fatorial = 1;
        serie = 0;
        
        for (double i = 1; i <= N; i++){
            fatorial = (fatorial * i);
            serie = (serie + (1/fatorial));
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
    }
}

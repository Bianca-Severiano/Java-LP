
import javax.swing.JOptionPane;
public class Pgr_Rec03 {
    public static void main (String Args []){
        double n;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor limite:"));
        JOptionPane.showMessageDialog(null,SomaFrac(n));
    }
    
    public static double SomaFrac(double n){
        double soma;
        if ( 1 == n){
            return 1/n;
        } else {
            soma = (1/n) + (SomaFrac(n-1));
            return soma;
        }  
        
    /*
    soma(3) = soma(2) + 3
    soma(2) = soma(1) + 2
    soma(1) = soma(0) + 1
    soma(0) = 0
    */
    }
}

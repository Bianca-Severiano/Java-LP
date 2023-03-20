
import javax.swing.JOptionPane;
public class Pgr_Rec04 {
    public static void main (String Args []){
        double n, d=1;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor limite:"));
        JOptionPane.showMessageDialog(null, CalcFra(n, d));
    }
    
    public static double CalcFra(double n, double d){
        double soma;
        if (n == 1){
            return 1/d;
        }else {
            soma = CalcFra((n-1), (d+1)) + (n/d);
            return soma;
        }
    }
    /*
    soma(3) = 3/1 + soma2
    soma(2) = 2/2 + soma1
    soma(1) = 1/3 + soma0
    soma(0) = 1/0
    */
}

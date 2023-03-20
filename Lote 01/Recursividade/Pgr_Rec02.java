
import javax.swing.JOptionPane;

public class Pgr_Rec02 {
    public static void main (String Args []){
        int n, b;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor limite:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor mínimo:"));
        JOptionPane.showMessageDialog(null, Soma(n, b));
    }
    
    public static int Soma (int a, int b){
        int soma;
        if ( b == a){
            return a;
        } else {
            soma = b + Soma(a,(b+1));
            System.out.println(soma);
            return soma;
        }
    }
    
    /*
    soma0 = 0 + soma(1)
    soma1 = 1 + soma(2)
    soma2 = 2 + soma(3)
    soma3 = 3  + soma(4)
    soma4 = 4;
    */
}

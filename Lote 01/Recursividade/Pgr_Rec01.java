
import javax.swing.JOptionPane;
public class Pgr_Rec01 {
    public static void main (String Args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor limite:"));
        JOptionPane.showMessageDialog(null, Soma(n));
    }
    
    static int Soma(int a){
        int soma;
        if (a == 1){
            System.out.println(a);
            return 1;
        } else {
            soma = a + Soma(a-1);
            System.out.println(soma);
            return soma;
        }
    }
    
    /*
    soma(3) = soma(2) + 3
    soma(2) = soma(1) + 2
    soma(1) = soma(0) + 1
    soma(0) = 0
    
    */

}

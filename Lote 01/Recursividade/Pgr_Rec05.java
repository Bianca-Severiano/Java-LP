

import javax.swing.JOptionPane;
public class Pgr_Rec05 {
    public static void main (String Args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor limite:"));
        JOptionPane.showMessageDialog(null, CalcSomaFat(n));
    }
    
    public static int CalcSomaFat(int n){
        int soma;
        if (n == 1){
            return 1;
        } else {
            soma = CalcSomaFat(n-1) + Fat(n);
            return soma;
        }
    }
    
    public static int Fat(int a){
        int fat;
        if (a == 1){
            return 1;
        } else {
            fat = a * Fat(a-1);
            return fat;
        }
    }
}

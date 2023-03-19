
import javax.swing.JOptionPane;
public class Pgr_Fun37 {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        for (int i = 1; i<= valor; i++) {  
           System.out.println(calcFibonacci(i));
        }
        
    }
    
    static int calcFibonacci(int v){
        int v2 = 1;
        int soma = 0;
        int v1;
          v1 = soma;
          soma = v1 + v2;
          v2 = v1;
   
        return soma;
    }
    
    
}

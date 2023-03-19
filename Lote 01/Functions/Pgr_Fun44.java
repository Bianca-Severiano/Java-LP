
import javax.swing.JOptionPane;
public class Pgr_Fun44 {
    public static void main (String args []){
        int base, expoente;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite valor da base: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite valor do expoente: "));
        System.out.println(Potencia(base, expoente));
    }
    
    static double Potencia (int b, int exp){
        double resultado;
        
        resultado = Math.pow(b, exp);
        return resultado;
    }
}

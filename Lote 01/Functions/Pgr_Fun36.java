
import javax.swing.JOptionPane;
public class Pgr_Fun36 {
    public static void main (String Args []){
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        JOptionPane.showMessageDialog(null, calcSerie(valor));
    }
    
    static double calcSerie (int v){
        double resultado=0;
        double fatorial=1;
        for (int i=1; i <= v; i++){
            fatorial = (fatorial * i);
            resultado = (resultado +  (1/fatorial));
        }
        return resultado;
    }
    
    
}

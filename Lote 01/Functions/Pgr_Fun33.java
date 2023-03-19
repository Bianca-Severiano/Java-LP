
import javax.swing.JOptionPane;
public class Pgr_Fun33 {
	public static void main (String Args[]) {
		int valor;
	 	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
	 	JOptionPane.showMessageDialog(null, "Resultado da série: " + CalcSerie(valor));
	}
	
	static double CalcSerie(int v) {
		double resultado = 0;
		double cont=1;
			do {
				resultado = (resultado + (1/cont)); 
				cont++;
			} while (cont <=v);
			
		return resultado;		
	}
}

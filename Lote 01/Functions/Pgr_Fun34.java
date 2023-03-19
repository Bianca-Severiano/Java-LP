
import javax.swing.JOptionPane;
public class Pgr_Fun34 {
	public static void main (String Arhs []) {
		int valor;
	 	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
	 	
	 	for (int i = 1; i <= 10; i++) {
	 		System.out.println(calcTabuada(valor, i));
		}
	}
	
	static int calcTabuada(int v, int i) {
		int resultado;
		resultado = v * i;
		return resultado; 
	}
}

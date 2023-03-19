
import javax.swing.JOptionPane;
public class Pgr_Fun32 {

		public static void main (String Args[]) {
		 	int valor;
		 	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		 	JOptionPane.showMessageDialog(null, "Seu fatorial é " + CalcFatorial(valor));
		}
		
		static int CalcFatorial(int v){
				int fatorial=1;
				for (int i = 1; i<=v; i++) {
					fatorial = (fatorial * i);
				}				
			return fatorial;
		}
}

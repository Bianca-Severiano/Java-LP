import javax.swing.JOptionPane;

public class Pgr_Fun35 {
	public static void main (String Args []) {
		int valor1, valor2;
	 	valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
	 	valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
	 	MaiorMenor(valor1, valor2);
	}
	
	public static void MaiorMenor (int v1, int v2) {
		int Maior, Menor;
		if (v1 > v2) {
			Maior = v1;
			Menor = v2;
		} else {
			Maior = v2;
			Menor = v1;
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos ímpares é : " + SomaImpar(Maior, Menor));
	}
	
	static int SomaImpar(int Maior, int Menor) {
		int resultado = 0;
			for (int i=Menor; i<=Maior; i++) {
				if (i%2!=0) {
					resultado = resultado + i;
				}
			}
		
		return resultado;
		
	}
	
}

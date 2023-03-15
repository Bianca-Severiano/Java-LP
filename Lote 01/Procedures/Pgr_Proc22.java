
import javax.swing.JOptionPane;

/*Exercício 22: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.

Programadoura: Bianca S.
Data: 09/03/2023
 */

public class Pgr_Proc22 {
    public static void main (String args []){
        LerValores();
    }
    
    // Ler valores diferentes
    static void LerValores(){
        int v1, v2;       
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        do {
            v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        } while (v2 == v1);       
        DefineValores(v1, v2);
    }
    
    
    // Define maior e menor 
    
    static void DefineValores(int v1, int v2){
        int maior = 0, menor = 0;
        if (v1 > v2){
            maior = v1;
            menor = v2;
        } else {
            menor = v1;
            maior = v2;
        }       
        MostraValores(maior, menor);
    }
    // Mostrar em ordem crescente
    static void MostraValores(int maior, int menor){
       JOptionPane.showMessageDialog(null, "Maior: " + maior + " // Menor: " + menor);
    }
}

/*Exercício 24: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

Programadoura: Bianca S.
Data: 09/03/2023
 */
import javax.swing.JOptionPane;
public class Pgr_Proc24 {
    public static void main (String args[]){
        LerValor();
    }
    
    // Ler valor
    static void LerValor(){
        double valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        Divisivel(valor);
    }
    
    // Verifica se é divisível por 2 e 3
    static void Divisivel(double v){
        double div2, div3;
        div2 = v%2;
        div3 = v%3;
        Resultados(div2, div3);
    }
    
    // Apresenta resultado
    static void Resultados(double d2, double d3){
        if (d2 == 0){
            if (d3 == 0){
                JOptionPane.showMessageDialog(null,"Divisível por 2 e 3");
            } else {
                JOptionPane.showMessageDialog(null, "Valor divisível apenas por 2");
            }
        } else {
            if (d3 == 0){
               JOptionPane.showMessageDialog(null, "Valor divisível apenas por 3");
            }
        }
    }
}

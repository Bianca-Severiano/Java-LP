/*Exercício 32: Receba um número inteiro. Calcule e mostre o seu fatorial.
Programadora: Bianca S.
Data: 23/02/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep32 {
    public static void main (String Args[]){
        int valor, fatorial=1;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        
        for (int i = 1; i <= valor; i++){
            fatorial = (fatorial * i);
        }
        
        JOptionPane.showMessageDialog(null, "O fatorial de " + valor + " é " + fatorial);
    }
}

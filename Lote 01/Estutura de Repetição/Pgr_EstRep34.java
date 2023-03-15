/*Exercício 34: Receba um número. Calcule e mostre os resultados da tabuada desse número.

Programadora: Bianca S.
Data: 23/02/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep34 {
    public static void main (String Args []){
        int valor, cont;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
        cont = 0;
        do {
            System.out.println(valor + " x " + cont + " = " + (valor*cont));
            cont ++;
        } while (cont <=10);
    }
}

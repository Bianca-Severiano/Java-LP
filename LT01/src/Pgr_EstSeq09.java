/*
Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeq09 {
    public static void main (String args []){
        int a, b, soma_quadrados;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        soma_quadrados = ((a*a)+(b*b));
        
        JOptionPane.showMessageDialog(null, "O valor da soma do quadrado dos números digitados é " + soma_quadrados);
    }

}

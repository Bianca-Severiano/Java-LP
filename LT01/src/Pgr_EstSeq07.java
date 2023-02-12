/*
Receba os valores do comprimento, largura e altura de um paralelepípedo. 
Calcule e mostre seu volume.
Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeq07 {
    public static void main (String args []){
        double h, largura, comprimento, volume;
        
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura: "));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
        
        volume = (h * comprimento * largura);
        
        JOptionPane.showMessageDialog(null, "O volume o paralelepipedo é: " + volume);
    }

}

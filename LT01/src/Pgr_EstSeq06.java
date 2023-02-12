/*
Receba os valores em x e y. Efetua a troca de seus valores e mostre seus 
conteúdos.
Programadora: Bianca S.
12/02/2023
*/
import javax.swing.JOptionPane;
public class Pgr_EstSeq06 {
    public static void main (String args []){
        int x, y, aux;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        aux = x;
        x = y;
        y = aux;
        
        JOptionPane.showMessageDialog(null, "Novo valor de X é: " + x);
        JOptionPane.showMessageDialog(null, "Novo valor de Y é: " + y);
        
    }

}

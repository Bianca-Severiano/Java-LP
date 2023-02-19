/*
Exercício 12: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.

Programadora: Bianca S.

Data: 16/02/2023
 */

package aula1602;
import javax.swing.JOptionPane;
public class Pgr_Seq12 {
    public static void main (String args []){
        int anoN, anoA, idade;
        
        anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        
        idade = (anoA-anoN);
        
        JOptionPane.showMessageDialog(null, "A idade sua idade é " + idade + " daqui a 17 anos você terá " + (idade+17) + " anos");
    }
    
}

/*Exercício 37: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu 
N’nésimo termo

Programadora: Bianca S.
Data: 02/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep37 {
    public static void main (String Args[]){
        int n, v1,v2, soma, soma2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        v2 = 1;
        soma = 0;
        
        for (int i = 1; i<= n; i++) {  
          v1 = soma;
          soma = v1 + v2;
          v2 = v1;
          System.out.println(soma); 
        }
                
    }
}

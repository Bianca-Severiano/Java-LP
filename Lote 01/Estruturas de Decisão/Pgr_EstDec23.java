/*
Exercício 23: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não 
necessariamente em ordem. Mostre os 4 números em ordem crescente.

Programadora: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstDec23 {
    public static void main (String args []) {
        int valores [] = new int [4];
        int aux, i=0;
        String vetorOrganizado = "";
        
        // Lendo os 3 primeiros valores em ordem crescente
        do {            
        aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")); 
           if (i == 0 || aux > valores[i-1]){
               valores[i] = aux;
               i++;
           } else {
               JOptionPane.showMessageDialog(null, "Valor precisa ser maior que o anterior");
           }              
        } while (i <= 2);                
         
        // Lendo quarto valor aleatóriamente
        valores[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")); 
        

        // Organizando vetor em ordem crescente
        for (int j = 0; j < 3; j++) {
          if (valores[3] < valores[j]){
              aux = valores[j];
              valores[j] = valores[3];
              valores[3] = aux;
          }
        }
        
        // Trasportando vetor para uma String e assim conseguir mostrar com JOptionPane
        for (int a = 0; a < 4; a++) {
            vetorOrganizado += valores[a] + ", ";
        }
        
        // Exibindo resultados
        JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + vetorOrganizado);
    }
}

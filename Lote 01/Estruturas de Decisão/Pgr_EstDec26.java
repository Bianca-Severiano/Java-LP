/*
Exercício 26: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo 
do menor.
Programadora: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;

public class Pgr_EstDec26 {
    public static void main (String args[]){
        int val1, val2, resto, maior, menor;
        
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        // Verificando qual dos dois números é o maior e efetuando cálculo para colher o resto
        if (val1 > val2){
            resto = val1 % val2;
            maior = val1;
            menor = val2;
        } else {
            resto = val2 % val1;
            maior = val2;
            menor = val1;
        }
        
        // Apresentando o resultado
        
        if (resto == 0){
            JOptionPane.showMessageDialog(null, maior + " é divisível por " + menor);
        } else {
            JOptionPane.showMessageDialog(null, maior + " não é divisível por " + menor);
        }
    }
}

/*Exercício 35: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somatória dos números ímpares entre esses valores.

Programadora: Bianca S.
Data: 23/02/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep35 {
    public static void main (String Args[]){
        int valor1, valor2, maior, menor, somaImpar;
        
        somaImpar = 0;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if (valor1 > valor2){
            maior = valor1;
            menor = valor2;
        } else {
            maior = valor2;
            menor = valor1;
        }
        
        for (int i = menor; i <= maior; i++){
            if (i%2 != 0){
                somaImpar = somaImpar + i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Soma dos ímpares é: " + somaImpar);
        
    }
    
}

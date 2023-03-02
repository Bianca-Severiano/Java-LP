/*Exercício 40:  Receba 2 números inteiros. Verifique e mostre todos os números primos 
existentes entre eles

Programadora: Bianca S.
Data: 02/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep40 {
    public static void main(String[] args) {
        int valor1, valor2, maior, menor, primo;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 1: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 2: "));
        
        // Descobre maior e menor
        if (valor1 > valor2){
            maior = valor1;
            menor = valor2;
        } else {
            maior = valor2;
            menor = valor1;
        }
        
     

       
    }
}

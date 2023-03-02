/*Exercício 38: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos 
valor. Obs.: somente valores positivos

Programadora: Bianca S.
Data: 02/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep38 {
    public static void main (String Args[]){
        int valor, maior, menor, contador;
        
        contador = 0;
        maior = 0;
        menor = 0;
        
       do {
           valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
           
           if (valor > 0){
             if (valor > maior || maior == 0){
                 maior = valor;
             }
             
             if (valor < menor || menor == 0){
                 menor = valor;
             }  
              contador ++;
           } else {
               JOptionPane.showMessageDialog(null, "Valor precisa ser positvo");
           }
       } while (contador < 100);
       
       JOptionPane.showMessageDialog(null, "Maior valor digitado: " + maior);
       JOptionPane.showMessageDialog(null, "Menor valor digitado: " + menor);
    }

}

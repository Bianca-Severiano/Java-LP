/*
Exercício 31: Calcule e mostre o quadrado dos números entre 10 e 150.
Programadora: Bianca S.
Data: 23/02/2023
 */

import javax.swing.JOptionPane;
public class Pgr_EstRep31 {
    public static void main (String Args[]){
        int quadrado;
        
        for (int i=10; i <=150; i++){
            quadrado = i * i;
            System.out.println("O quadrado de " + i + " é: " + quadrado);
        }
        
    }
}

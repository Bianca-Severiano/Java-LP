/*
Exercício 15: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa.

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Pgr_Seq15 {
    public static void main (String args []){
        int cateto1, cateto2;
        double hipotenusa;
        
        cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° cateto: "));
        cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° cateto: "));
        
        hipotenusa = Math.sqrt((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)));
        
        System.out.println(hipotenusa);
    }
    
}

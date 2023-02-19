/*
Receba a temperatura em graus Celsius. Calcule e mostre a sua 
temperatura convertida em fahrenheit F = (9*C+160) /5
Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstSeq04 {

    public static void main (String args[]){
        double Celsius, F;
        Celsius = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em °C: "));
        
        F = (((9*Celsius) +160)/5);
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " + F);
                
    }
}

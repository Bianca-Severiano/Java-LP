/*Exercício 26: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo 
do menor.

Programadoura: Bianca S.
Data: 13/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc26 {
    public static void main (String srgs []){
        LerValores();
    }
    
    // Ler valores
    public static void LerValores(){
        int valor1, valor2;
        valor1 = 0;
        valor2 = 0;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        MaiorMenor(valor1, valor2);
    }
    
    //Define maior e menor e realiza a divisão
    public static void MaiorMenor(int v1, int v2){
        double resto;
        resto = 0;
        if (v1 > v2){
            resto = v1 % v2;
        } else {
            resto = v2 % v1;
        } 
        Resultados(resto);
    }
    
    public static void Resultados(double r){
        if (r == 0){
            JOptionPane.showMessageDialog(null, "Valores são múltiplos");
        } else {
            JOptionPane.showMessageDialog(null, "Valores não são múltiplos");
        }
    }
}

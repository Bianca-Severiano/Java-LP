/*
Coletar o valor do lado de um quadrado, calcular sua área e apresentar o 
resultado.

Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;

public class Pgr_EstSeq01 {

    public static void main (String ars []){
        int lado, area;       
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ")); 
        area = lado * lado;
        JOptionPane.showMessageDialog(null,  "A área de seu quadrado é: " + area);
    }
    
}

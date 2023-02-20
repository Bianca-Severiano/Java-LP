/*
Exercício 27: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de 
duração (minutos). Calcule e mostre a velocidade média em km/h
Programadora: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstDec27 {
    public static void main (String args[]){
        double numeroVoltas, extCircuito, tempo, velocidade;
        
        numeroVoltas = Double.parseDouble(JOptionPane.showInputDialog("Número de voltas: "));
        extCircuito = Double.parseDouble(JOptionPane.showInputDialog("Extensão do circuito (Em metros): "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo do percurso (Em minutos): "));
        
        // Convertendo unidades
        extCircuito = (extCircuito/1000);
        tempo = (tempo/60);
        
        //Calculando velocidade
        velocidade = ((extCircuito * numeroVoltas)/ tempo);
        
        JOptionPane.showMessageDialog(null, "A velocidade é " + velocidade + " Km/h");
    }
        
}

/*
Exercício 17: Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.

Programadora: Bianca S.

Data: 16/02/2023
 */
package aula1602;

import javax.swing.JOptionPane;

public class Pgr_Seq17 {
    public static void main (String args []){
        double tempo, velocidade, distancia, gasto;
        
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo gasto na viagem (horas): "));
        velocidade = Double.parseDouble(JOptionPane.showInputDialog("Velociadade do veículo (Km/H): "));
        
        distancia = (velocidade * tempo);
        
        gasto = (distancia / 12);
        
        JOptionPane.showMessageDialog(null, "Foram consumidos " + gasto + " litros de gasolina durante a viagem");
    }
    
}

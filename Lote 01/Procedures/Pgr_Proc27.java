/*Exercício 27: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de 
duração (minutos). Calcule e mostre a velocidade média em km/h


Programadoura: Bianca S.
Data: 13/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc27 {
    public static void main (String args[]){
        ReceberValores();
    }
    
    public static void ReceberValores(){
        double voltas, extensao, tempo;
        voltas = 0;
        extensao = 0;
        tempo = 0;
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Número de Voltas: "));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Extensão do circuito em metros: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo do percurso em minutos: "));
        
        CalculoDistanciaVelocidade(voltas, extensao, tempo);
    }
    
    public static void CalculoDistanciaVelocidade(double voltas, double extensao, double tempo){
        double velocidade;
        velocidade = 0;
        extensao = (extensao/1000)*voltas;
        tempo = tempo/60;
        velocidade = extensao/tempo;
        
        Resultados(velocidade);
    }
    
    public static void Resultados(double velocidade){
        JOptionPane.showMessageDialog(null, "A velocidade do veículo é " + velocidade + " Km/h");
    }
}

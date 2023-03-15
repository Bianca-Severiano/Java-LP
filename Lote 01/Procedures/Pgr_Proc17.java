/*Exercício 17:  Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.

Programadoura: Bianca S.
Data: 02/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc17 {
    public static void main (String Args[]){
        ReceberValores();
    }
           
        // Receber Valores
        static void ReceberValores(){
            double tempoPercurso, velocidadeMedia;
            tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Tempo de percurso em horas: "));
            velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Velocidade média em Km/H: "));
            ConverteDistancia(tempoPercurso, velocidadeMedia);
           
        }
        
        // Realizar a conversão de tempo de percurso e velocidade para distância
        static void ConverteDistancia(double tempoPercurso, double velocidadeMedia){
            double distancia;
            distancia = (tempoPercurso*velocidadeMedia);
            QntCombustivel(distancia);
        }
    
        // Calcular quantidade de combustivel gasta
       static void QntCombustivel(double distancia){
           double combustivelGasto;
           combustivelGasto = distancia / 12;
           JOptionPane.showMessageDialog(null,"Total de gasolina gasto na viagem em Litros: " + combustivelGasto);
       }


}

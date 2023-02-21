/*
Exercício 25: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.

Programadoura: Bianca S.

Data: 19/02/2023
*/

import javax.swing.JOptionPane;
public class Pgr_EstDec25 {
    public static void main (String args []){
        int Hora_Inicio, Hora_Fim, HoraD, Minuto_Inicio, Minuto_Fim, MinutoD, controle;
       
        Hora_Inicio = Integer.parseInt(JOptionPane.showInputDialog("Hora de início do jogo: "));
        Minuto_Inicio = Integer.parseInt(JOptionPane.showInputDialog("Minutos de início do jogo: "));
        Hora_Fim = Integer.parseInt(JOptionPane.showInputDialog("Hora do final do jogo: "));
        Minuto_Fim = Integer.parseInt(JOptionPane.showInputDialog("Minuto do final do jogo: "));
        
        // calculando horas
            if (Hora_Inicio >= Hora_Fim){
                HoraD = (24 - Hora_Inicio)+ Hora_Fim; 
            } else {
                HoraD = Hora_Fim - Hora_Inicio;
            }

        //calculando minutos
            if (Minuto_Inicio > Minuto_Fim){
                MinutoD = (60 - Minuto_Inicio) + Minuto_Fim;
                HoraD = HoraD - 1;
            } else {
                MinutoD = Minuto_Fim - Minuto_Inicio;
            }
            
        // apresentando resultados
            if (HoraD > 24){
                JOptionPane.showMessageDialog(null, "Partida não pode ter mais que 24h");
            } else {
                JOptionPane.showMessageDialog(null, "Jogo durou " + HoraD + ":" + MinutoD);
            }
            
    }
}

/*Exercício 25: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.

Programadoura: Bianca S.
Data: 13/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc25 {
public static int HoraD, MinutoD;
    public static void main(String args []){
       LerValores();
   }
    
    public static void LerValores(){
         int Hora_Inicio, Hora_Fim, Minuto_Inicio, Minuto_Fim;
       
        Hora_Inicio = Integer.parseInt(JOptionPane.showInputDialog("Hora de início do jogo: "));
        Minuto_Inicio = Integer.parseInt(JOptionPane.showInputDialog("Minutos de início do jogo: "));
        Hora_Fim = Integer.parseInt(JOptionPane.showInputDialog("Hora do final do jogo: "));
        Minuto_Fim = Integer.parseInt(JOptionPane.showInputDialog("Minuto do final do jogo: "));
        
        HorasD(Hora_Inicio, Hora_Fim);
        MinutosD(Minuto_Inicio, Minuto_Fim);
        
    }
    
       public static void HorasD(int Hora_Inicio, int Hora_Fim){
            if (Hora_Inicio >= Hora_Fim){
                HoraD = (24 - Hora_Inicio)+ Hora_Fim; 
            } else {
                HoraD = Hora_Fim - Hora_Inicio;
            }
        }
    
    public static void MinutosD(int Minuto_Inicio, int Minuto_Fim){
            
            if (Minuto_Inicio > Minuto_Fim){
                MinutoD = (60 - Minuto_Inicio) + Minuto_Fim;
                HoraD = HoraD - 1;
            } else {
                MinutoD = Minuto_Fim - Minuto_Inicio;
            }
        Resultado(HoraD);
    }
    
    public static void Resultado (int HoraD){
             if (HoraD > 24){
                JOptionPane.showMessageDialog(null, "Partida não pode ter mais que 24h");
            } else {
                JOptionPane.showMessageDialog(null, "Jogo durou " + HoraD + ":" + MinutoD);
            }
    }
    
}

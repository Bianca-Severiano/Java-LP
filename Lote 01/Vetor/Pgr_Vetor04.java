
import javax.swing.*;
public class Pgr_Vetor04 {
    public static void main (String args []){
        double notas [] = new double [5];
        double media, acima, Posabaixo;
     
        //Ler valores do vetor 
        
        for (int i = 0; i < 5; i++) {
            notas[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
        }
        
        media = MediaGrupo(notas);
        acima = NotasAcima(notas , media);
       
        
        System.out.println("Média: " + media);
        System.out.println("Qnt acima: " + acima);   
    }
    
    static double MediaGrupo (double Notas []){
        double m = 0;
        for (int i = 0; i < 5; i++){
            m = m + Notas[1];
        }
         m = m/5;
        return m;
    }
    
    static double NotasAcima (double Notas[], double media){
        int quantidade=0;
        for (int i = 0; i < 5; i++) {
            if (Notas[i] > media ){
                quantidade++;
            } else {
                System.out.println(i);
            }
        } 
       return quantidade;
    }
    
}

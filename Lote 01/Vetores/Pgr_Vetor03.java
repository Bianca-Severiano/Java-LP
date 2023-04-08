
import java.util.Arrays;
import javax.swing.*;
public class Pgr_Vetor03 {
 public static void main (String args []){
     int vet1[] = new int [3];
     int vet2[] = new int [3];
     
     //Carregar vetores
     for (int i = 0; i < 3; i++) {
         vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para vet1["+i+"]: "));
         vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para vet2["+i+"]: "));
     }
     
     // Chama função para unir vetores  
     System.out.println(Arrays.toString(UneVetor(vet1, vet2)));
     
 }
 
    static int [] UneVetor(int vet1[], int vet2[]){
     int vet3[] = new int [6];
        for (int i = 0; i < 6; i++) {
            if(i <=2){
                vet3[i] = vet1[i];
            } else {
                vet3[i] = vet2[i-3];
            }
        }
        return vet3;
    }
}

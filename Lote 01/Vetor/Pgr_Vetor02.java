
import javax.swing.*;
public class Pgr_Vetor02 {
    public static void main (String args []){
        int vet[] = new int [5];
        int maior = 0, menor = 0, media = 0;
        
        for (int i = 0; i < 5; i++){
           vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
           
           // Determina maior e menor enquanto lê valores
           if (maior == 0 || vet[i]>maior ){
               maior = vet[i];
           } else if (menor == 0 || vet[i]<menor){
               menor = vet[i];
           }
           
           // Obtém soma de valores digitados
           media = media + vet[i];
        }
        
        media = media / vet.length;
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Media dos valores: " + media);
    }
}

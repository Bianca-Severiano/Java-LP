
import javax.swing.*;

public class Pgr_Vetor01 {
    
    public static void main (String Args []){ 
        
        int vet[] = new int [5];
        int soma_media = 0, contador_media=0, soma_impar = 0, media;
        
        //Ler valores
        for (int i = 0; i < 5; i++) {
           vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
           
           // Se entre 10 e 200
           if (vet[i]>=10 && vet[i]<=200){
               soma_media= soma_media + vet[i];
               contador_media++;
               
           // Se ímpar
           } else if (vet[i]%2 != 0){
               soma_impar = soma_impar + vet[i];
           }
        }
        media = soma_media / contador_media;
        System.out.println("Média dos valores entre 10 e 200: " + soma_media);
        System.out.println("Soma dos valores ímpares: " + soma_impar);
    }
    
}

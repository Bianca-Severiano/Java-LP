

import javax.swing.JOptionPane;

public class Pgr_Vetor6 {
    public static void main (String Args []){
        int vet[] = new int [10];
        
        // Ler valores 
        for (int i = 0; i < 10; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de vet["+i+"]: "));
            System.out.print(vet[i] + ",");
        }
        
        OrganizaVetor(vet);
    }
    
    public static void OrganizaVetor(int vetor[]){
        //Organiza Vetor  
        for (int i = 0; i < vetor.length-1; i++) {
            int aux;            
            for (int j = 0; j < vetor.length-1 - i; j++) {               
                if (vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        
        // Mostra resultado organizado
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + ",");
        }
    }
}

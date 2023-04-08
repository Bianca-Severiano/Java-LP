

import javax.swing.JOptionPane;

public class Pgr_Vetor07 {
    public static void main (String Args[]){
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
        int aux, valor_busca=0, cont=0;  
        for (int i = 0; i < vetor.length-1; i++) {          
            for (int j = 0; j < vetor.length-1 - i; j++) {               
                if (vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        
        valor_busca = Integer.parseInt(JOptionPane.showInputDialog("Digite valor que deseja localizar: ")); 
        
        
        int inicio = 0;
        int meio = 0;
        int fim = vetor.length-1;
        
        do { 
            meio = (inicio + fim)/2;
            if (meio == valor_busca){
                System.out.println("Valor encontrado no vetor");
                break;
            } else if( valor_busca > meio){
                inicio = meio + 1;
            } else if (valor_busca < meio){
                fim = meio - 1;
            }  
        }while(inicio <= fim);
        
        if (inicio > fim){
            System.out.println("Valor não encontrado no vetor");
        }
    }
    
   
}

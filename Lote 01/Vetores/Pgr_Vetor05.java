
import javax.swing.JOptionPane;

public class Pgr_Vetor05 {
    public static void main (String args []){
        int vet[]= new int [10];
        
        //Ler valores do vetor 
        for (int i = 0; i < 10; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para vet["+i+"]:"));
            System.out.print(vet[i] + ", ");
            
        } 
        System.out.println(" ");
        System.out.println("==========");
        CalcSoma(vet);
    }
    
    public static void CalcSoma(int vetor[]){
        int soma = 0;
        for (int i = 1; i <= vetor.length/2 ; i++) {
            soma = soma + (vetor[i-1] + vetor[(vetor.length)-i]);
            System.out.println(soma);
        }
    }
}

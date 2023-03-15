/*Exercício 23: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

Programadoura: Bianca S.
Data: 09/03/2023
 */
import javax.swing.JOptionPane;
public class Pgr_Proc23 {
    static int vetor [] = new int [4];
    public static void main (String args[]){
     LerValores();   
    }
    
    // Ler 3 primeiros valores em ordem crescente e o 4 valor, armazenando em um vetor
    static void LerValores(){
        // ler valor 1
        vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        // ler valor 2
        do {
             vetor[1]= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        } while (vetor[1] <= vetor[0]);
        
        // ler valor 3
        do {
            vetor[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        } while (vetor[2] <= vetor[1] );
        
        // ler valor 4
        vetor[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));
        
        OrganizaVetor();
    }
    
    // organizando vetor
    static void OrganizaVetor(){
        int aux;
        for (int i = 0; i <=3; i++){
            if (vetor[3] < vetor[i]){
                aux = vetor[i];
                vetor [i] = vetor[3];
                vetor[3] = aux;
            }
        }
       Resultado();
    }
    
    // Apresenta vetor organizado
    static void Resultado(){
        for (int i=0; i <=3; i++){
            System.out.println(vetor[i]);
        }
    }
}

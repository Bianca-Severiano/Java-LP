
import javax.swing.JOptionPane;
public class Pgr_Matriz11 {
    public static void main (String args []){
        int matriz [][] = new int [8][8];
        int vet[] = new int [4];
        
        // ler valores que usuário definir para a matriz
        for (int i = 0; i < 4; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
            System.out.println(vet[i]);
        }
        
        // Montando a matriz
        for (int i = 1; i <= 4 ; i++) {
            for (int j = i-1; j < 9-i; j++) {
                for (int k = i-1; k < 9-i; k++) {
                    matriz[j][k] = vet[i-1]; 
                }
            }
        }
        
        // Mostrando matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");                
            }
                System.out.println();
        }
        
        
    }
}

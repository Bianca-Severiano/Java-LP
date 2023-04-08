
import javax.swing.JOptionPane;

public class Pgr_Matriz12 {
    public static void main (String Args []){
        int matriz [][] = new int [3][3];
        int vet[] = new int [8];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
                vet[(matriz[i][j])]++;
            }
        }
        
        for (int i = 1; i < 8; i++) {
            System.out.println(vet[i]);
        }
        
    }
}

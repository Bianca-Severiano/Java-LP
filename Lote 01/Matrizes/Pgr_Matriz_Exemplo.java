
import javax.swing.*;
public class Pgr_Matriz_Exemplo {
    public static void main (String args []){
        int math [][] = new int [3][2];
      
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                math[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
                System.out.println("Math["+i+"]["+j+"] = "+math[i][j]);
            }
        }

        System.out.println("Linhas: " + math.length);
        System.out.println("Colunas: " + math[0].length);
    }
}


import javax.swing.JOptionPane;

public class Pgr_Matriz09 {

    public static void main(String Args[]) {
        double mat[][] = new double[4][4];
        double mat2[][] = new double[4][4];

        // Carregando matriz 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    mat[i][j] = Math.pow(4, j);
                } else {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: "));
                }
            }
        }

        // Carregando matriz 2
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i + j == 3) {
                    mat2[i][j] = Math.pow(2, i);
                } else {
                    mat2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: "));
                }
            }
        }

        //Mostrando Matriz 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("-----------------------");
        
        //Mostrando Matriz 2
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}


import javax.swing.JOptionPane;

public class Pgr_Matriz08 {

    public static void main(String Args[]) {
        int produtos[][] = new int[4][3];
        int produtos_semana[] = new int[4];
        int cada_produto_mes[] = new int[3];
        int tot_produtos = 0;

        //Carregando matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                produtos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade vendida do produto " + (j + 1) + " na semana " + (i + 1) + ":"));
                // Soma da quantidade de produtos vendidos na semana
                produtos_semana[i] = produtos_semana[i] + produtos[i][j];

                // Soma da quantidade do mesmo produtos vendidos durante o mês
                cada_produto_mes[j] = cada_produto_mes[j] + produtos[i][j];

                //total de produtos
                tot_produtos = tot_produtos + produtos[i][j];
            }
        }

        //Mostrando resultados
        //Total vendido no mês
        System.out.println("Total de produtos vendidos no mês: " + tot_produtos);
        System.out.println("--------------------------------");

        //Total vendido por semana              
        for (int i = 0; i < 4; i++) {
            System.out.println("Total de produtos vendidos na semana " + (i + 1) + ": " + produtos_semana[i]);
        }
        System.out.println("--------------------------------");

        //Total vendido por semana  
        for (int i = 0; i < 3; i++) {
            System.out.println("Total do produto " + (i + 1) + " vendido no mês: " + cada_produto_mes[i]);
        }
        System.out.println("--------------------------------");
    }
}

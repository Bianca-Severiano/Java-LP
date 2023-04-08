public class Pgr_Matriz10 {
    public static void main (String Args []){
        double mat[][] = new double [8][8];
        double aux = 1;
        
        // carrega matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = aux;
                aux = aux *2;
            }
        }
        
        // mostra matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

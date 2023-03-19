
public class Pgr_Fun41 {
    public static void main (String Args[]){
        for (int i = 1; i <= 6; i++){
            for (int j=1; j<=6; j++){
                if  (Soma7(i, j)== 7){
                    System.out.println(j + " + " + i + " = " + Soma7(i,j) );
                }
            }
        }    
    }
    
    static int Soma7 (int i, int j){
        int soma;
        soma = i + j;
        return soma;
    }
}

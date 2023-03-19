/*
Exercício 31: Calcule e mostre o quadrado dos números entre 10 e 150.

Programadora: Bianca S.

Data: 15/03/2023
 */


public class Pgr_Func31 {
    public static void main (String args[]){
      int valor=10; 
      do{
      System.out.println(CalculaQuadrado(valor));
      valor ++;
      } while (valor <= 15);
    }
    
    static int CalculaQuadrado(int val){
            int quad = 0;
           quad = val*val;
           return quad;
    }
}


public class Pgr_Fun42 {
   public static void main (String Args []){
       System.out.println(Serie());
   } 
   
   static double Serie(){
       double resultado = 0, denominador=1;
       
        for (double i = 1; i <=3; i++){
           resultado = resultado + (i/denominador);
           denominador = denominador + 2;
       }
      return resultado;
   }
   
}
    
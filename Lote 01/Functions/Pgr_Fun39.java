
public class Pgr_Fun39 {
  public static void main (String ARGS []){
      System.out.println(FunGraos());
  }  
  
  static double FunGraos(){
      double qntGraos = 0;     
      for (int i = 0; i<=3; i++){
          qntGraos = (qntGraos + (Math.pow(2, i)));
      }
      return qntGraos;
  }
}

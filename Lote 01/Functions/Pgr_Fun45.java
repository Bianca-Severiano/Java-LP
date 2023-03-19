

public class Pgr_Fun45 {
    public static void main (String Args []){
        System.out.println(CalcSerie());
    }
    
    static double CalcSerie(){
        double resultado = 0;
        
        for (int i=1; i <=3; i++){
                if (i%2==0){
                    resultado = resultado - (i/(Math.pow(i,2)));
                } else {
                    resultado = resultado + (i/(Math.pow(i,2)));
                }
            
        }
        
        return resultado;
    }
}

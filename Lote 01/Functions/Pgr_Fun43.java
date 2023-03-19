
public class Pgr_Fun43 {
    public static void main (String Args[]){
        System.out.println(CalcAltura());
    }
    
    static int CalcAltura(){
        int anos=0;
        double ana = 1.1, maria = 1.5;
        
        do {
            ana = ana + 0.03;
            maria = maria + 0.02;
            anos++;
        } while (ana < maria);
        
        return anos;
    }
    
}

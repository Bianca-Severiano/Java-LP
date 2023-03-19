
import javax.swing.JOptionPane;
public class Pgr_Fun40 {
    static int maior, menor;
    public static void main (String Args []){
       int valor1, valor2;
       valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));         
       valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));   
       
       verificaMaiorMenor(valor1, valor2);
    }
    
    public static void verificaMaiorMenor(int v1, int v2){
        
        if (v1 > v2){
            maior = v1;
            menor = v2;
        } else {
            menor = v1;
            maior = v2;
        }
        
        System.out.println(SomaPrimos(maior, menor));
    }
    
    static int SomaPrimos (int maior, int menor){
        int soma=0, cont=0;
        
        for (int i = menor; i<=maior; i++){            
            for (int a = 1; a<= i; a++){
                if (i%a==0){
                   cont++; 
                }
            }
            if (cont <= 2){
                soma = soma + i;
            }        
          cont = 0;
        }      
        return soma;
    }
    
}

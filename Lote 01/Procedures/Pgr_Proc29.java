/*Exercício 29: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do 
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a 
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados

Programadoura: Bianca S.
Data: 13/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc29 {
    public static void main (String args[]){
        LerTipoValor();
    }
    
    public static void LerTipoValor(){
        int tipo;
        double valor;
        
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de investimento: 1 - Poupança / 2 - Renda Fixa"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor investido: R$"));
        
        if (tipo == 1){
            Poupanca(valor);
        } else {
            RendaFixa(valor);
        }
    }
    
    //Caso opção 1
    public static void Poupanca (double valor){
        double rendimento;
        rendimento = ((valor*0.03) + valor);
        Resultado(rendimento);
    }
    
    //Caso opção 2
    public static void RendaFixa (double valor){
         double rendimento;
        rendimento = ((valor*0.05) + valor);
        Resultado(rendimento);
    }
    
    // Resultado
    public static void Resultado(double rendimento){
        JOptionPane.showMessageDialog(null, "Valor após 30 dias de aplicação: " + rendimento);
    }
}

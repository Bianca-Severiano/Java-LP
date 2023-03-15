
import javax.swing.JOptionPane;

/*Exercício 28: Receba o preço atual e a média mensal de um produto. Calcule e mostre o 
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
do menor.

Programadoura: Bianca S.
Data: 13/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc28 {
    public static void main (String args[]){
     LerValores();
    }
    
   public static void LerValores(){
        double precoProduto, mediaMensal;
        precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: R$"));
        mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal de vendas: "));       
        NovoValor(precoProduto, mediaMensal);
   }
   
   public static void NovoValor(double precoProduto, double mediaMensal){
       double novoPreco;      
       if (precoProduto >=30){ // Preço maior ou igual a 30
 
            if (precoProduto < 80){ // entre 30 e 79
                if (mediaMensal >= 500 && mediaMensal < 1000) { // condição 2
                    novoPreco = precoProduto + (precoProduto * 0.15);
                } else { // exceção 2
                    novoPreco = precoProduto;
                }
            } else { // maior ou igual a 80
                if (mediaMensal >= 1000){ //condição 3
                    novoPreco = precoProduto - (precoProduto * 0.05);
                } else { // exceção 3
                    novoPreco = precoProduto;
                }
            }          
        } else { // Preço menor que 30
            
            if (mediaMensal < 500){
                novoPreco = (precoProduto + (precoProduto * 0.1));
            } else {
                novoPreco = precoProduto;
            }
        }
     
      JOptionPane.showMessageDialog(null, "Novo preço do produto é: R$" + novoPreco);
   } 
}

/*
Exercício 16: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.

Programadora: Bianca S.

Data: 16/02/2023
 */

package aula1602;

import javax.swing.JOptionPane;

public class Pgr_Seq16 {
    public static void main (String args []){
        int qntHT, numDesc, acresDescendente;
        double valorHT, salarioLiquido, salarioBruto,salarioDesconto, perDesconto;
        
        qntHT = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: "));
        valorHT = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor pago por hora trabalhada? : R$ "));
        numDesc = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de descendentes: "));
        perDesconto = Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto: "));
        
        perDesconto = (perDesconto / 100); // Converte porcentagem para decimal
        acresDescendente = (numDesc * 100); // Valor a ser acrescido por descendentes
        
        salarioBruto = (qntHT * valorHT); // Salario Bruto
        
        salarioDesconto = (salarioBruto - (salarioBruto * perDesconto)); // Salárrio com desconto
        salarioLiquido = salarioDesconto + acresDescendente; // Salário com desconto + acrescímo por descendentes
        
        JOptionPane.showMessageDialog(null, "O salário líquido é: R$" + salarioLiquido);   
    }
    
}

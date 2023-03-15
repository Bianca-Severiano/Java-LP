/*Exercício 16:  Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

Programadoura: Bianca S.
Data: 02/03/2023
 */

import javax.swing.JOptionPane;
public class Pgr_Proc16 {
    
    public static void main (String Args[]){
        EntradaValores();
    }
    
    // Entradas de valores
    static void EntradaValores(){
        int HorasTrabalhadas, numDescendentes;
        double valorHora, percentualDesconto;
        
        HorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas: "));
        numDescendentes = Integer.parseInt(JOptionPane.showInputDialog("Número de descendentes: "));
        
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora trabalhada: R$"));
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto: "));
        
        CalcSalarioLiquido(HorasTrabalhadas, numDescendentes,valorHora,percentualDesconto);
    }
    
    // Calculo Descedentes
    static double AcrescDescendentes (int Num_Descendentes){
        double Acrescimo;
        Acrescimo = Num_Descendentes * 100;
        return Acrescimo;
    }
    
    // Calculo salário + desconto
    static double SalarioDesconto(int HorasTrabalhadas, double ValorHora, double percentualDesconto){
        double Salario;
        Salario = HorasTrabalhadas * ValorHora;
        Salario = Salario - (Salario*(percentualDesconto/100));
        return Salario;
    }
    
    // Calculo do salario  + adicional de dependentes
    static void CalcSalarioLiquido(int HorasT, int NumDesc, double valorH, double percentual){
        double Salario = SalarioDesconto(HorasT, valorH, percentual);
        double Acrescimo = AcrescDescendentes(NumDesc);
        Salario = Salario + Acrescimo;
        JOptionPane.showMessageDialog(null, Salario);
    }

}

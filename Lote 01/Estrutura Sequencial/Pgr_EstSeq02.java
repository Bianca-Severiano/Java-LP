/*
Receba o salário de um funcionário e mostre o novo salário com reajuste 
de 15%.

Programadora: Bianca S.
12/02/2023
*/

import javax.swing.JOptionPane;

public class Pgr_EstSeq02 {
    public static void main (String args []){
        double salario, salario_reajustado;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual: R$"));
        salario_reajustado = salario * 1.15;
        JOptionPane.showMessageDialog(null, "Seu salário reajustado (15%) é: R$" + salario_reajustado);
    }
}

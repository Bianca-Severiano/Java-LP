/*
Exercício 21: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.

Programadora: Bianca S.

Data: 16/02/2023
*/

import javax.swing.JOptionPane;

public class Pgr_EstDec21 {
    public static void main (String args[]){
        double n1, n2, n3, n4, media;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segunda nota: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da terceira nota: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da quarta nota: "));
        
        media = ((n1 + n2 + n3 + n4)/4);
        
        if (media >= 3){
            if (media >=6){
                JOptionPane.showMessageDialog(null, "Aluno Aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno de Exame");
            }
        } else {
        JOptionPane.showMessageDialog(null, "Aluno Retido");
        }
   
        
    }
}

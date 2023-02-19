/*
Exercício 13: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.

Programadora: Bianca S.

Data: 16/02/2023
 */

package aula1602;
import javax.swing.JOptionPane;
public class Pgr_Seq13 {
     
    public static void main (String args[]){
    double qntAlimentos, qntDias, qntAlimentosGramas;
    
    qntAlimentos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em Kg: "));
    qntAlimentosGramas = qntAlimentos*1000;
    qntDias = qntAlimentosGramas / 50;
    
    JOptionPane.showMessageDialog(null, "Essa quantidade de alimentos duraria " + qntDias + " dias");
    
    }
}


import javax.swing.JOptionPane;

/*Exercício 21:  Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.

Programadoura: Bianca S.
Data: 09/03/2023
 */
public class Pgr_Proc21 {
    public static void main (String Args[]){
        LerNotas();
    }
    
    // Ler notas
    static void LerNotas(){
        double n1, n2, n3, n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota 2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota 3: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota 4: "));
        
        CalcMedia(n1, n2, n3, n4);
    }
    
    // Calcular média
    static void CalcMedia(double n1, double n2, double n3, double n4){
        double media;
        media = ((n1+n2+n3+n4)/4);
        ResultadoAluno(media);
    }
    
    // Resultado do aluno
    static void ResultadoAluno(double media){
        if (media < 3){
            // retido
            JOptionPane.showMessageDialog(null, "Aluno Retido");
        } else {
            if (media >= 6){
                // aprovado
                JOptionPane.showMessageDialog(null, "Aluno Aprovado");
            } else {
                // exame
                JOptionPane.showMessageDialog(null, "Aluno de exame");
            }
        }
    }
}

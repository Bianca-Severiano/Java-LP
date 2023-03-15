/*Exercício 39: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N

Programadora: Bianca S.
Data: 02/03/2023
 */

public class Pgr_EstRep39 {
    public static void main(String[] args) {
        int quantidadeCasa, cont; 
        cont = 1;
        quantidadeCasa = 1;
        while (cont <= 64){
            System.out.println("Casa " + cont + " - Quantidade de grãos: " + quantidadeCasa);
            quantidadeCasa = quantidadeCasa * 2;
           cont++;
        }
    }
}

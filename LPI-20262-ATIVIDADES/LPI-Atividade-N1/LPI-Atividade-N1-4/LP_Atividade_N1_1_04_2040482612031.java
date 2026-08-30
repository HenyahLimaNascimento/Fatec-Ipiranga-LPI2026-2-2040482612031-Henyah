/* ------------------------------------------------------------------------*
 * Disciplina: Linguagem de Programacao I
 *             Prof. Verissimo
 * ------------------------------------------------------------------------*
 * Objetivo do Programa: Simular a sequencia de movimentos do Xeque Pastor
 *                        em um tabuleiro de xadrez representado por matriz
 *                        bidimensional.
 *
 * Data - 30/08/2026
 * Autor: Henyah Lima do Nascimento
 * ------------------------------------------------------------------------*/

import java.util.Scanner; 

public class main {

    /* Para a movimentação das peças, será necessário criar 2 funções, uma para printar
        o tabuleiro e outra para movimentar as peças. */
        /* Inicializando uma função publica chamada "moviTabuleiro" para fazer a movimentação das peças. 
            Os valores X e Y utilizados nas posições representam posiçãoX = Linha e posiçãoY = Coluna.
         */
    public static void movimentacao (String tabuleiro [][], int posiInicialX, int posiInicialY, int posiFinalX, int posiFinalY){ 

        /* Dentro da função publica será feito o código para movimentação das peças */
        /* Essa parte do código irá armazenar a peça dentro da variável "moviPeca" e, quando a peça
        se mover, o campo vazio ficará com os "..." */

        String moviPeca = new String();
        moviPeca = tabuleiro [posiInicialX][posiInicialY]; 
        tabuleiro[posiInicialX][posiInicialY] = "...";

        /* Para fazer a movimentação de fato, adicionamos o valor da peça nas posições finais do array.  */
        tabuleiro[posiFinalX][posiFinalY] = moviPeca;
        
      }
      public static void printarTabuleiro (String tabuleiro [][]){

        /* Aqui usamos o "i < tabuleiro.lenght" pois o "i" precisa ser menor que a posição do tabuleiro. 
        Se usar "<=" a variável "i" vai tentar acessar um valor que está fora do array. */

        System.out.println("  |  A  |  B  |  C  |  D  |  E  |  DF  |  G  |  H  |");
        for (int i = 0; i < tabuleiro.length;i++){
            System.out.print((tabuleiro.length - i ) + " | ");

            for (int x = 0; x < tabuleiro[i].length; x++ ){

                /* Dentro do for colocamos um System.out.print para printar o tabuleiro */
                System.out.print(tabuleiro[i][x] + " | " );
            }

            System.out.println();
        }

        System.out.println();
      }
     public static void main (String[] args) {
        Scanner s = new Scanner (System.in);


        /* Primeiro foi declarado como irá funcionar o tbauleiro, para isso foi utilizado
        um vetor bidimensional com 8 linhas x 8 colunos.
        Foi utilizado o tipo String para poder colocar o nome das peças. */

        //Declarando e inicializando o tabuleiro: 
        String tabuleiro [][]= {
            {"TP1", "CP2", "BP3", "DP4", "RP5", "BP6", "CP7", "TP8"},
            {"PP1", "PP2", "PP3", "PP4", "PP5", "PP6", "PP7", "PP8"},
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
            {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "},
            {"PB1", "PB2", "PB3", "PB4", "PB5", "PB6", "PB7", "PB8"},
            {"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"},
        }; 

        
        //Tabuleiro incial: 
        printarTabuleiro (tabuleiro);
        
        //Jogada 1 - Peça branca: Peão do rei -> E4
        movimentacao(tabuleiro, 6, 4, 4, 4);
        printarTabuleiro (tabuleiro);

        //Jogada 1 - Peça preta: Peão do rei -> E5
        movimentacao(tabuleiro, 1, 4, 3, 4);
         printarTabuleiro (tabuleiro);

         //Jogada 2 - Peça branca: Bispo do rei -> BC4
        movimentacao(tabuleiro, 7, 5, 4, 2);
        printarTabuleiro (tabuleiro);

        //Jogada 2 - Peça preta: Cavalo da Dama -> C6
        movimentacao(tabuleiro, 0, 1, 2, 2);
         printarTabuleiro (tabuleiro);

         //Jogada 3 - Peça branca: Dama -> H5
        movimentacao(tabuleiro, 7, 3, 3, 7);
        printarTabuleiro (tabuleiro);

        //Jogada 3 - Peça preta: Cavalo do rei -> F6
        movimentacao(tabuleiro, 0, 6, 2, 5);
         printarTabuleiro (tabuleiro);

         //Jogada 4 - Peça branca captura o peão do rei
         //Dama branca saí de h5 e vai para f7
        movimentacao(tabuleiro, 3, 7, 1, 5);
        printarTabuleiro (tabuleiro);
        

        

      

        s.close();
     }
}

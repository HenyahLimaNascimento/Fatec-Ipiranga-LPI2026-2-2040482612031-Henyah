import java.util.Scanner;
public class LP_Atividade_N3_01_2040482612031{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);


        System.out.print("Quantidade de leituras: ");
        int qtdLeitura = s.nextInt();

        double [] temp = new double [qtdLeitura];

        for (int i = 0; i < qtdLeitura; i++){
            System.out.print("Temperatura (°C): ");
            temp[i] = s.nextDouble();

        }

        //Criando o segundo for para repetir a parte de leituras registradas
        /* Aqui tem que usar o .length porque os números na variável de temperatura
        não são valores fixos, ai no caso o .length "pergunta" para o vetor quantas
        posições ele tem fazendo com que o for visite a quantidade certa de posições. */
        System.out.print("---- Leituras Registradas ----");
        for (int i = 0; i < temp.length; i++){
           System.out.printf("\nLeitura [%d]:  %.1f°C%n", i, temp[i]);
        }


        //Acesso direto pelo índice sem uma estrutura de repetição necessária 

        System.out.print("---- Acesso direto ----");
        System.out.printf("\nPrimeiro índice(0): %.1f°C%n", temp[0]);

        /* Quando queremos colocar um número inteiro em uma posição específica, dá para colocar o %d
        essa parte do "temp.length-1" pega a última posição do vetor e armazena no código onde está o
        %d.
        Essa parte "temp[temp.length-1]" seria o valor guardado naquele índice (a temperatura) */ 
        System.out.printf("Último leitura (índice %d): %.1f°C%n", temp.length-1, temp[temp.length-1]);

        double maior = temp [0];
        double menor = temp [0];
        int indiceMaior = 0;
        int indiceMenor = 0;


        /* Neste caso, o for começa no 1 porque já declarei o índice 0 nas variáveis maior e menor
         */
        for (int i = 1; i < temp.length; i++){

            //Utilizei 2 IFs separados pois são duas perguntas diferentes, não sendo necessário utilizar o else
            //Se a temperatura for a maior do índice, será armazenada aqui
            if (temp[i] > maior ){
                maior = temp [i];
                indiceMaior = i;
            }


            //Se a temperatura for menor já vista, vai armazenar aqui 
            if (temp[i] < menor) {
                menor = temp[i];
                indiceMenor = i;
            }

        }

        System.out.println("-- Busca Linear: Extremos --");
        System.out.printf("Maior temperatura: %.1f°C (índice %d)%n", maior, indiceMaior);
        System.out.printf("Menor temperatura: %.1f°C (índice %d)%n", menor, indiceMenor);


        System.out.print("Temperatura crítica de alerta (°C): ");
        double temperaturaCritica = s.nextDouble();
 
        int indiceAlerta = -1;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= temperaturaCritica) {
                indiceAlerta = i;
                break;
            }
        }
 
        System.out.println("-- Busca Linear: Alerta --");
        if (indiceAlerta != -1) {
            System.out.printf("Alerta:  temperatura crítica atingida na leitura de índice %d (%.1f°C).%n",
                    indiceAlerta, temp[indiceAlerta]);
        } else {
            System.out.println("Alerta:  nenhuma leitura atingiu ou ultrapassou a temperatura crítica informada.");
        }


        

        s.close();
    }
}
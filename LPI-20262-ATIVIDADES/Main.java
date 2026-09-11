import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int qtdAlunos = scanner.nextInt();
        scanner.nextLine(); // Limpa o Enter após a quantidade

        String[] nomes = new String[qtdAlunos];
        double[] notas1 = new double[qtdAlunos];
        double[] notas2 = new double[qtdAlunos];
        double[] medias = new double[qtdAlunos];
        String[] situacoes = new String[qtdAlunos];

        double somaMedias = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Nome do aluno [" + (i + 1) + "]: ");
            nomes[i] = scanner.nextLine();

            // Validação Nota 1
            System.out.print("Nota 1 (0 a 10): ");
            double n1 = scanner.nextDouble();
            while (n1 < 0.0 || n1 > 10.0) {
                System.out.println("[ERRO] Nota invalida! A nota deve estar entre 0.0 e 10.0. Digite novamente.");
                System.out.print("Nota 1 (0 a 10): ");
                n1 = scanner.nextDouble();
            }
            notas1[i] = n1;

            // Validação Nota 2
            System.out.print("Nota 2 (0 a 10): ");
            double n2 = scanner.nextDouble();
            while (n2 < 0.0 || n2 > 10.0) {
                System.out.println("[ERRO] Nota invalida! A nota deve estar entre 0.0 e 10.0. Digite novamente.");
                System.out.print("Nota 2 (0 a 10): ");
                n2 = scanner.nextDouble();
            }
            notas2[i] = n2;

            // IMPORTANTE: Limpa o Enter deixado pelo ultimo nextDouble()
            scanner.nextLine();

            // Cálculo da média e situação
            medias[i] = (notas1[i] + notas2[i]) / 2.0;

            if (medias[i] >= 6.0) {
                situacoes[i] = "APROVADO";
                aprovados++;
            } else {
                situacoes[i] = "REPROVADO";
                reprovados++;
            }

            somaMedias += medias[i];

            // Exibe o relatório do aluno atual
            System.out.println("-- RELATÓRIO INDIVIDUAL --");
            System.out.printf("Aluno: %s | N1: %.2f | N2: %.2f | Média: %.2f | Situação: %s\n\n", 
                              nomes[i], notas1[i], notas2[i], medias[i], situacoes[i]);
        }

        // Descobre maior e menor média
        double maiorMedia = medias[0];
        double menorMedia = medias[0];

        for (int i = 1; i < qtdAlunos; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
            }
        }

        double mediaGeral = somaMedias / qtdAlunos;
        double pctAprovados = ((double) aprovados / qtdAlunos) * 100;
        double pctReprovados = ((double) reprovados / qtdAlunos) * 100;

        System.out.println("==========================================");
        System.out.println(" ESTATÍSTICAS DA TURMA");
        System.out.println("==========================================");
        System.out.println("Total de alunos processados: " + qtdAlunos);
        System.out.printf("Média Geral da Turma: %.2f\n", mediaGeral);
        System.out.printf("Maior Média da Turma: %.2f\n", maiorMedia);
        System.out.printf("Menor Média da Turma: %.2f\n", menorMedia);
        System.out.printf("Aprovados: %d alunos (%.2f%%)\n", aprovados, pctAprovados);
        System.out.printf("Reprovados: %d alunos (%.2f%%)\n", reprovados, pctReprovados);
        System.out.println("==========================================");

        scanner.close();
    }
}
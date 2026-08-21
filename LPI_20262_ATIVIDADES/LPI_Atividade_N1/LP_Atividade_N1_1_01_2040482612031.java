import java.util.Scanner;
public class LP_Atividade_N1_1_01_2040482612031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Idade do Aluno: ");
        byte idade = scanner.nextByte();
        
        //2
        System.out.print("Número de Faltas: ");
        short faltas = scanner.nextShort();

        //3
        System.out.print("Matrícula ID: ");
        int matriculaId = scanner.nextInt();

        //4
        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = scanner.nextLong();

        //5
        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        //6
        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = scanner.nextDouble();

        //7
        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = scanner.next().charAt(0);

        //8
        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = scanner.nextBoolean();

        System.out.println("--- Dados do Aluno Fictício ---");
        System.out.println("Idade: " + idade);
        System.out.println("Faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final: " + conceitoFinal);
        System.out.println("Aprovado: " + aprovado);    

        scanner.close();
    }
}
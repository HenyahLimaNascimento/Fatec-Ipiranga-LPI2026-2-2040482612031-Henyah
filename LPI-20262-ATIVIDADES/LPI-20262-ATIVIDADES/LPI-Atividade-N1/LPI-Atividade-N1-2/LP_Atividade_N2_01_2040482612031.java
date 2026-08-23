import java.util.Scanner;
public class LP_Atividade_N2_1_2040482612031
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		    System.out.print("Quantidade de alunos na turma: ");
		    int qtdAluno = s.nextInt();
		    
		    double notaAluno = 0; 
		    double somaNota = 0;
		    double mediaNota = 0;
		    double maiorNota = 0;
		    
		    
		    /* A estrutura for foi utilizada aqui porque antes de começar a ler a Nota
		    nós sabemos quantas vezes ela será repetida. Se a turma tem 5 alunos, a nota será 
		    repetida 5x.*/
		    
		    
		    for (int i = 0; i < qtdAluno; i++){
		        System.out.println("Nota do aluno: ");
		        notaAluno = s.nextDouble();
		        somaNota = somaNota+notaAluno;
		        
		        if (notaAluno > maiorNota) {
                maiorNota = notaAluno;
                
		        }
		    }
		    
		    /* O cálculo da média precisa ser calculada ao lado de fora pois utilizamos
		    o cálculo da soma total das notas. Como a soma total das notas está dentro
		    do laço de repetição, só podemos calcular a media quando obtivermos a soma total das notas*/
		    mediaNota = somaNota/qtdAluno;
		    
		    System.out.println("Soma total das notas: " + somaNota);
		    System.out.println("\nMédia da turma: " + mediaNota);
		    System.out.println("\nMaior nota da turma: " + maiorNota);
		    
		    
		
		
		s.close();
	}
}

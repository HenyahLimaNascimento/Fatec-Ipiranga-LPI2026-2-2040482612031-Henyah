import java.util.Scanner;
public class LP_Atividade_N1_1_09_2040482612031
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Abordagem 1: Estrutura condicional if-else 
		System.out.println("\n--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
		System.out.print("Informe a nota final do aluno: ");
		double notaFinal = s.nextDouble();
		
		if (notaFinal >= 6){
		    System.out.print("Situação (if-else): Aprovado\n");
		}
		
		else {
		    System.out.print("Situação (if-else): Reprovado\n");
		}
		
		//Abordagem 2 -- Operador Ternário 
		String aprovaAluno = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
		System.out.println("\n--- Abordagem 2: Operador Ternário Simples ---");
	    System.out.println("Situação (Ternário): " + aprovaAluno);
		s.close();
	}
}

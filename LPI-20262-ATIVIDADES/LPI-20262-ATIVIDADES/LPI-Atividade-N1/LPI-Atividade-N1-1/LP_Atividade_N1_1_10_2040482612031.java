import java.util.Scanner;
public class LP_Atividade_N1_1_10_2040482612031
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	
	    System.out.print("Informe o valor de A: ");
	    double a = s.nextDouble();
	    
	    System.out.print("Informe o valor de B: ");
	    double b = s.nextDouble();
	    
	    System.out.print("Informe o valor de C: ");
	    double c = s.nextDouble();
	    
	    System.out.print("Informe o valor de D: ");
	    double d = s.nextDouble();
	    
	    System.out.print("Informe a média do aluno: ");
	    double media = s.nextDouble();
	    
	     System.out.print("Informe o percentual de presença: ");
	   double presenca = s.nextDouble();
	   
	   System.out.println("--- Demonstração de Precedência Aritmética ---");
	    
	    double resParent = a * b / c + d;
	    double resSemParent = ((a * b)/c) + d;
	    
	    System.out.println("Resultado Sem Parênteses: " + resSemParent);
	    System.out.println("Resultado Com Parênteses: " + resParent + "\n");
	    
	    System.out.println("--- Validação do critério de aprovação ---");
	    
	    System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
	    
	    boolean aprovadoDireto = media >= 6 && presenca >= 75;
	    System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);
	   
		s.close();
	}
}

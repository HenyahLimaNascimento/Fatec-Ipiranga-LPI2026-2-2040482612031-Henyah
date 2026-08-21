import java.util.Scanner;
public class LP_Atividade_N1_1_03_2040482612031
{
	public static void main(String[] args) {
	    
    Scanner s = new Scanner (System.in);
    
		
		Integer idade1 = null;
		System.out.print("Tentando realizar operação artimética com Interger nulo...");
		
		try {
		    	int y = idade1 + 1;
		}
		
		catch (NullPointerException e){
		    
		System.out.print("\nErro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada(null).");
		System.out.print("\nDetalhe da exceção: java.lang.NullPointerException");
		System.out.print("\nInforme uma idade valida: ");
	
		    
		}
		
		int novaIdade = s.nextInt();
		int idadeProxAno = novaIdade + 1;
		System.out.print("\nRetribuindo valor válido para a variável...");
		System.out.print("\nOperação bem-sucedida! Idade atual: " + novaIdade +"| Idade próximo ano: " + idadeProxAno);
		
		
		s.close();
		
		
	}
}

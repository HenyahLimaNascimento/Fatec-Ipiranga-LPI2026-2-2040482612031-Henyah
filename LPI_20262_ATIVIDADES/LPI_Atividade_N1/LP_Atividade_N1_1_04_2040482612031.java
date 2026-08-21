import java.util.Scanner;
public class LP_Atividade_N1_1_04_2040482612031
{
    
    public static final String NOME_INST = "FATEC Ipiranga.";
	public static final int PRAZO_MAX_EMP = 14;
	
	public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
        System.out.print("Informe o número de dias do empréstimo: ");
        int diasEmprestimo = s.nextInt();
        
        //Parametro para passar a variável em final
        final int diasDevo = diasEmprestimo; 
        
        System.out.println("Instituição: " + NOME_INST);
        System.out.println("\nPrazo Máximo Padrão: " + PRAZO_MAX_EMP);
        System.out.println("\nDias Calculados para devolução: " + diasDevo);
		
		
	s.close();
	}
}

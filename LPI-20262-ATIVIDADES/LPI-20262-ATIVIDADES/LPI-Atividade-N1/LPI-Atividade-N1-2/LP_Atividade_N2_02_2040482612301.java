import java.util.Scanner;
public class LP_Atividade_N2_2_2040482612301
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		double valorVenda = 0;
		double totalVenda = 0;
		int qtdVendas = 0;
		
		System.out.print("--- Execução 1 (com vendas) --- "); 
		
		/* Nesse exercício, precisa utilizar o do-while pois o enunciado pede por 
		um menu que deverá ser executado até o usuário pedir para sair.*/
		
		do { 
		    System.out.print("\nValor da venda (ou 0 para encerrar): "); 
		    valorVenda = s.nextDouble(); 
		    
		    /* Esse filtro diz se essa venda é realmente uma venda ou se o usuário
		    quer sair do menu. Como no enuncaido diz que 0 não é um valor e sim 
		    um indicativo de que o usuário quer sair do menu, toda vez que o programa ler um valor, 
		    ele precisa fazer a verificação se é diferente de zero.*/
		    
		    if (valorVenda != 0 ){
		    totalVenda = totalVenda + valorVenda;
                qtdVendas = qtdVendas + 1;
		    }
		    
		} while (valorVenda != 0);
		
		if (qtdVendas > 0){ 
		    
		    double media = totalVenda / qtdVendas;
            System.out.printf("\nTotal vendido no turno: R$ %.2f%n", totalVenda);
            System.out.println("\nQuantidade de vendas: " + qtdVendas);
            System.out.printf("\nValor médio por venda: R$ %.2f%n", media);
        }
        
        else {
            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
		}
		
		
		
		s.close();
	}
}

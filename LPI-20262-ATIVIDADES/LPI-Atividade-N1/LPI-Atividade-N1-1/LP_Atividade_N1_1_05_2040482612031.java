import java.util.Scanner;
public class LP_Atividade_N1_1_05_2040482612031
{
	
	public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Estoque inicial: ");
    int estoque = s.nextInt();
    
    System.out.print("Quantidade de entrada: ");
    int qtdEntrada = s.nextInt();
    
    System.out.print("Quantidade saída 1: ");
    int qtdSaida1 = s.nextInt();
    
    System.out.print("Quantidade saída 2: ");
    int qtdSaida2 = s.nextInt();
    
    System.out.print("Estoque Mínimo: ");
    int estoqueMinimo = s.nextInt();
    
    System.out.print("Tamanho do lote: ");
    int tamanhoLote = s.nextInt();
    
    
    int valorAposEntrada = estoque + qtdEntrada;
    int valorAposSaida = valorAposEntrada - qtdSaida1;
    int valorAposSaida2 = valorAposSaida - qtdSaida2;
    
    
    
    System.out.print("Estoque inicial: " + estoque + " unidades.");
    
    System.out.print("\nApós entrada (+" +qtdEntrada+"): " + valorAposEntrada + " unidades.");
    estoque = estoque + qtdEntrada; 
    
    System.out.print("\nApós saída (-" +qtdSaida1+"): " + valorAposSaida + " unidades.");
    estoque = estoque - qtdSaida1;
    
    System.out.print("\nApós outra saída (-" +qtdSaida2+"): " + valorAposSaida2 + " unidades.");
    estoque = estoque - qtdSaida2;
    
    System.out.print("\nO nível de estoque atual ("+estoque+") está abaixo do mínimo ("+estoqueMinimo+")? ");
    System.out.print(estoque < estoqueMinimo);
    
    System.out.print("\nUnidades fora de caixas fechadas de " + tamanhoLote+ ": " + (estoque % tamanhoLote));
    
    System.out.print("\nO estoque está perfeitamente fracionado em caixas completas? ");
    System.out.print(estoque % tamanhoLote == 0);
		
		
		
	s.close();
	}
}
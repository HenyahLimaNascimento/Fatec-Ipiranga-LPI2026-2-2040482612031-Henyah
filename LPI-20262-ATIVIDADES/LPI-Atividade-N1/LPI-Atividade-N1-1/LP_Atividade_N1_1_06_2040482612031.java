import java.util.Scanner;
public class LP_Atividade_N1_1_06_2040482612031
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe um nome de usuário: ");
		String texto = s.nextLine();
		
		//.length para conseguir o tamanho da string
		if (texto != null && texto.length() > 0){
		    System.out.print("Usuário válido fornecido: " + texto);
		}
		else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }
		    
		/* 
	        O & simples avalia os 2 lados da expressão, mesmo quando o primeiro já for o suficiente
	        para saber a resposta. Então nós temos o "texto != null & texto.length() > 0",
	        mesmo se "texto != null" for falso, o Java ainda tentaria executar "texto.length()" —
	        e chamar um método em uma referência nula lança uma NullPointerException. 
	        O && evita esse erro porque nunca chega a avaliar o lado direito quando o esquerdo já é falso.
		*/
		s.close();
	}
}

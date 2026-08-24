import java.util.Scanner;
public class LP_Atividade_N1_1_02_2040482612031 {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		
		//1
		System.out.print("Valor para comparação de primitivos: ");
		int valorPrimitivo = scanner.nextInt();
		int a = valorPrimitivo;
		int b = a;
		
		//2
		System.out.print("Valor para comparação de objetos (new Integer): ");
		int valorObjeto = scanner.nextInt();
		Integer a2 = new Integer(valorObjeto);
		Integer b2 = new Integer(valorObjeto);
		
		//3
		System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
		int valorCache = scanner.nextInt();
		Integer xCache = valorCache;
		Integer yCache = valorCache;
		
		//4
		System.out.print("Valor fora do Integer Cache: ");
		int valorForaCache = scanner.nextInt();
		Integer xForaCache = new Integer(valorForaCache);
		Integer yForaCache = new Integer(valorForaCache);
		
		System.out.print("--- Comparação de Primitivos (int) ---");
		System.out.print("\naPrimitivo == bPrimitivo: ");
		System.out.print(a == b);
		
		System.out.print("\n--- Comparação de Objetos via 'new Integer()' ---");
		System.out.print("\naObjeto == bObjeto (Identidade): ");
		System.out.print(a2 == b2);
		System.out.print("\naObjeto.equals(bObjeto) (Valor): ");
		System.out.print(a2.equals(b2));
		
		System.out.print("\n--- Comparação com Autoboxing e Integer Cache ---");
		System.out.print("\nDentro do Cache (120) -> xCache == yCache: ");
		System.out.print(xCache == yCache);
		
		System.out.print("\nFora do Cache (200) -> xForaCache == yForaCache: ");
		System.out.print(xForaCache == yForaCache);
		System.out.print("\nFora do Cache (200) -> xForaCache.equals(yForaCache): ");
		System.out.print(xForaCache.equals(yForaCache));
		
		
		scanner.close();
		
	}
}


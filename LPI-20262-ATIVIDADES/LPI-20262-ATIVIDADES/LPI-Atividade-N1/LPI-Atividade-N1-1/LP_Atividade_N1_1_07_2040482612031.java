import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class LP_Atividade_N1_1_07_2040482612031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Informe o valor A (ex.:1.00): ");
        String valorA = scanner.nextLine();

        //2
         System.out.print("Informe o valor B (ex.:0.90): ");
        String valorB = scanner.nextLine();

        //3
         System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.nextLine();

        //4
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---\n");
        double a = Double.parseDouble(valorA);
        double b = Double.parseDouble(valorB);

        BigDecimal a2 = new BigDecimal(valorA);
        BigDecimal b2 = new BigDecimal(valorB);

        System.out.print("Resultado esperado de " + valorA + " - " + valorB + " seria " + (a2.subtract(b2)) + "\n");
        System.out.print("Resultado real obtido com double: " + (a - b) + "\n");

        System.out.print("\n--- Correção exata utilizando java.math.BigDecimal ---\n");
        System.out.print("Resultado com BigDecimmal (String Constructor): " + (a2.subtract(b2)) + "\n");

        System.out.print("\n--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---\n");
        BigDecimal compra = new BigDecimal(valorCompra);
        BigDecimal parcela = compra.divide(new BigDecimal(numeroParcelas), 2, RoundingMode.HALF_UP);
        System.out.print("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + parcela + " por parcela.\n");

        scanner.close();
    }
}
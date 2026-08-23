import java.util.Scanner;
public class LP_Atividade_N1_1_08_2040482612031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = scanner.nextDouble();

        //2
        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        long totalCentavos = Math.round(valorTotalReais * 100);
        long parcelaCentavos = totalCentavos / numeroParcelas;

        System.out.print("--- Calculadora Financeira Escolar (Mapeamento em Centavos) ---\n");
        System.out.print("Valor total convertido: " + totalCentavos + " centavos.\n");
        System.out.print("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + parcelaCentavos + " centavos por parcela.\n");
        System.out.print("valor convertido para exibição: R$ " + (parcelaCentavos / 100.0) + "\n");

        scanner.close();

        //vantagens: usa somente numeros inteiros e evita problemas de arredondamento que occorem com o double
        //desvantagens: conversão de reais para centavos necessaria, melhor para 2 casas decimais e menos adequado para calculos financeiros
    }
}
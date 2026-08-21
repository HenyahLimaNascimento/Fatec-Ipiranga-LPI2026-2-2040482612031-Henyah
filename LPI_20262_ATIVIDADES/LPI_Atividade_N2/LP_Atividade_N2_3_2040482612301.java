import java.util.Scanner;

public class LP_Atividade_N2_3_2040482612301 {

    public static final int PIN = 1234;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int pinDig = 0;
        int tentativas = 0;
        
        
        /*Para esse exercício foi utilizado o while pois no enunciado diz
        que enquanto o PIN informado foi diferente do padrão colocado na class PIN, ele deve 
        repetir até o usuário acertar*/

        while (pinDig != PIN) {

            System.out.print("Informe o PIN de acesso: ");
            pinDig = s.nextInt();

            tentativas++;

            if (pinDig != PIN) {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        }

        System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");

        s.close();
    }
}
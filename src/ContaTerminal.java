import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Número da agência: ");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" +
                saldo + " já está disponível para saque.");

    }
}

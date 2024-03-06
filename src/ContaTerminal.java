import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = leitorDeDados.nextLine();

        System.out.print("Informe o número de sua agência: ");
        String agencia = leitorDeDados.nextLine();

        System.out.print("Informe seu número: ");
        int numero = leitorDeDados.nextInt();

        System.out.print("Informe o saldo atual: ");
        double saldo = leitorDeDados.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + ", e seu saldo de " + saldo + " já está disponível para saque.");
        leitorDeDados.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Saldo!");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

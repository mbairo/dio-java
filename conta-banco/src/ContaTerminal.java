import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numConta, continuar;
        String agencia, nomeCliente;
        double saldo;

        do {

        System.out.println("\n*** Banco DIO ***\n");
        System.out.println("Favor informar os dados abaixo");
        System.out.print("Agência: ");
        agencia = scanner.next();
        System.out.print("Conta: ");
        numConta = scanner.nextInt();
        System.out.print("Usuário: ");
        nomeCliente = scanner.next();
        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("\nOlá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque\n");

        System.out.print("\n\nDeseja realizar nova consulta/cadastro? (Sim: 1 | Não: 0) ");
        continuar = scanner.nextInt();

        } while (continuar == 1);

        System.out.println("### Programa finalizado ###");

        
    }
}

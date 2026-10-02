import java.util.Scanner;

public class ContaTerminal {
    static void main(String[] args) {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        int numeroDigitado = sc.nextInt();

        if (numeroDigitado == numero)
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero+"e seu saldo R$"+saldo+" ja esta disponivel para saque.");
        else
            System.out.println("Conta invalida, tente novamente");
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        String agencia;
        String nomeCliente;
        float saldo = 0;

        System.out.println("Olá, qual é seu nome?");
        nomeCliente = scan.next();

        System.out.println("Qual é o número da sua conta?");
        numero = scan.nextInt();

        System.out.println("Qual é o número da sua agência?");
        agencia = scan.next();

        System.out.println("Qual é o seu saldo?");
        saldo = scan.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero+"e seu saldo "+ saldo +" já está disponível para saque");
    }
}
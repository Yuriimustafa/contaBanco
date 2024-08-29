import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = entradaDados.nextLine();
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = entradaDados.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = entradaDados.nextInt();
        
        System.out.println("Por favor, digite o valor do primeiro depósito: ");
        double saldo = entradaDados.nextDouble();

        entradaDados.close();

        String mensagem = "Olá " + nomeCliente + 
                          ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + 
                          " e seu saldo R$" + String.format("%.2f", saldo) + 
                          " já está disponível para saque.";

        // Exibir a mensagem
        System.out.println(mensagem);
    }

}
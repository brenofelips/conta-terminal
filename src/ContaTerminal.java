import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;
        try{
            System.out.println("Olá seja bem vindo! Informe seu nome:");
            nomeCliente = scanner.nextLine();
            System.out.println("Informe sua agência:");
            agencia = scanner.nextLine();
            System.out.println("Informe o numero da conta:");
            numero = scanner.nextInt();
            System.out.println("Informe o saldo da conta:");
            saldo = scanner.nextDouble();


            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        }catch (Exception e){

        }

        scanner.close();
        System.exit(0);
    }
    
}

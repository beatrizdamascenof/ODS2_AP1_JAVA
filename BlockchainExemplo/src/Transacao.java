import java.util.Scanner;

public class Transacao {
    Blockchain blockchain = new Blockchain(4);
    Scanner scanner = new Scanner(System.in);

public void fazerTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Executando a opção 1 - Fazer transação...");
        boolean parada = true;

        while (parada) {
        
            System.out.println("Escolha o tipo de transação:");
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.println("3. Ver histórico");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Saque.");
                    blockchain.addBlock(blockchain.newBlock("Saque feito!!"));
                    break;
                case 2:
                    System.out.println("Você escolheu Depósito.");
                    blockchain.addBlock(blockchain.newBlock("Deposito feito!!"));
                    break;
                case 3:
                    System.out.println("Você escolheu Ver histórico.");
                    System.out.println(blockchain);
                    break;
                case 4:
                    parada = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("A pausa foi interrompida");
            }
        }
    }


public void visualizarHistorico() {
    System.out.println("Você escolheu Ver histórico.");
    System.out.println(blockchain);
}

public void pesquisarTransacao() {
    System.out.println("Qual transação deseja visualizar? ");
    String text = scanner.nextLine();
    boolean contemTransacao = Utils.containsBlock(blockchain, text);
    if (contemTransacao) {
        System.out.println("A blockchain contém a transação: " + text);
    } else {
        System.out.println("A blockchain não contém a transação: " + text);
    }

}
}

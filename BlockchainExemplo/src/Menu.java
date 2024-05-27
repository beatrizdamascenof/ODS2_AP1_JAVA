import java.util.Scanner;

public class Menu {
    Transacao t = new Transacao();
    public void abrirMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1- Fazer transação");
            System.out.println("2- Visualizar histórico de transações");
            System.out.println("3- Pesquisar transação");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    t.fazerTransacao();
                    break;
                case 2:
                    t.visualizarHistorico();
                    break;
                case 3:
                    t.pesquisarTransacao();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 4);

        scanner.close();
    }

}

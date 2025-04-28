import java.util.Scanner;

public class menuinteraivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Opção Adicionar executada.");
                    break;
                case 2:
                    System.out.println("Opção Remover executada.");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scan.close();
    }
}

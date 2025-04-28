import java.util.Scanner;

public class validacaoentrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número entre 1 e 100:");
            num = scan.nextInt();
        
        }   while (num < 1 || num > 100);

        System.out.println("Número validado:" + num);
        scan.close();
    }
}

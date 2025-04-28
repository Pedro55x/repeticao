import java.util.Scanner;

public class medianotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somanotas = 0;
        double nota;
        int cont = 0;
        String continuar;

        do{
            System.out.print("Digite a nota do aluno (0 a 10): ");
            nota = scan.nextDouble();
            somanotas += nota;
            cont++;

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("s"));

        double media = somanotas / cont;
        System.err.println("A média das notas é: " + media);
        scan.close();
    }
}
import java.util.Scanner;

public class somapositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double numero;
        
        System.out.println("Digite números positivos para somar (digite um negativo para encerrar):");
        
        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();
            
            if (numero < 0) {
                break;
            }
            
            soma += numero;
        }
        
        System.out.println("Soma total dos positivos: " + soma);
        scanner.close();
    }}
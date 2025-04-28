import java.util.Scanner;
import java.util.Random;

public class jogodeadivinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int numsorteado = rand.nextInt(20) + 1;
        int palpite;
        int tentativas = 0;

        do{
            System.out.println("Digite seu palpite (1 a 20:)");
            palpite = scan.nextInt();
            tentativas++;

            if(palpite < numsorteado) {
                System.out.println("O número sorteado é maior.");
                } else if (palpite > numsorteado){
                    System.out.println("O número sorteado é menor.");
                } else {
                    System.out.println("Boa! Você acertou em " +  tentativas + " tentativas.");
                }
            }   while(palpite != numsorteado);

                scan.close();
        }
    }
public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 0;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");

        while(count < 10) {
            System.out.println(n1);
            int prox = n1 + n2;
            n1 = n2;
            n2 = prox;
            count++;
        }
    }
}
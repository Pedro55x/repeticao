import java.util.Scanner;
public class validacaosenha {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        String senhacorreta = "1234";
        String senhadigitada = "";

        while(!senhadigitada.equals(senhacorreta)){
            System.out.print("Digite a senha:");
            senhadigitada = digitar.nextLine();

            if(!senhadigitada.equals(senhacorreta)){
                System.out.println("Senha incorreta, tente novamente.");
            }
        }
        
        System.out.println("Acesso concedido.");

            digitar.close();
    }
}
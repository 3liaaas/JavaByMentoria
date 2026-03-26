import java.util.Scanner;

public class MainValidacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("Digite sua senha: ");
        String password = sc.nextLine();

        boolean temMaiuscula = false;
        boolean temMinuscula = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) temMaiuscula = true;
                if (Character.isUpperCase(c)) temMinuscula = true;
            }

            if (!temMaiuscula) {
                System.out.println("Insira uma letra maiúsucula.");
            } else if (!temMinuscula) {
                System.out.println("Insira uma letra minúscula.");
            } else if (password.length() < 8) {
                System.out.println("senha com menos de 8 digítos.");
            } else {
                System.out.println("Acesso Permitido.");
                break;
            }

        }

    }
}

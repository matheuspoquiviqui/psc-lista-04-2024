import java.util.Scanner;
public class Ativ02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

            System.out.println("Escreva um nome de Usário e em seguida uma senha:");
            System.out.print("(OBS: O campo 'Usuário' e o campo 'Senha' não podem ser iguais.)");
            
            System.out.print("\nUSUÁRIO: ");
            nomeUsuario = scanner.nextLine();
            System.out.print("SENHA: ");
            senha = scanner.nextLine();

            while  (senha.equals(nomeUsuario)) {
                System.out.println("Erro: O campo 'Usuário' e o campo 'senha'são iguais! ");
                System.out.print("Digite a senha novamente: ");
                senha = scanner.nextLine();
            }
            System.out.println("Usuário e Senha válidados corretamente!");
            scanner.close();
    }
}

            

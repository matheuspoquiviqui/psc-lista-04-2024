import java.util.Scanner;
public class Ativ03 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String nome;
    double idade, salario;
    char sexo, estadoCivil;

    do {
        System.out.print("Escreva seu nome (maior que 3 cacteres): ");
        nome = scanner.nextLine();
    } while (nome.length() <= 3);

    do{
        System.out.print("Escreva sua idade (Entre 0 e 150): ");
        idade = scanner.nextDouble();
    } while (idade <0 || idade > 150);

    do{
        System.out.print("Digite seu salário atual: (maior que 0): R$");
        salario = scanner.nextDouble();
    } while (salario <= 0);

    do {
        System.out.print("Digite seu sexo ('f' ou 'm'): ");
        sexo = scanner.next().charAt(0);
    } while (sexo != 'f' && sexo != 'm');

    do {
        System.out.print("Escreva seu Estado Civil ('s', 'c', 'v', ou 'd'): ");
        estadoCivil = scanner.next().charAt(0);
    } while (estadoCivil != 's' && estadoCivil !='c' && estadoCivil !='v' && estadoCivil !='d');
    
    System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}

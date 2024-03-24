import java.util.Scanner;
public class Ativ08 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, n4, n5, soma, media;

        System.out.print("Escreva o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.print("Escreva o segundo número: ");
        n2 = scanner.nextDouble();
        System.out.print("Escreva o terceiro número: ");
        n3 = scanner.nextDouble();
        System.out.print("Escreva o quarto número: ");
        n4 = scanner.nextDouble();
        System.out.print("Escreva o quinto número: ");
        n5 = scanner.nextDouble();

        soma = n1 + n2 + n3 + n4 + n5;
        media = soma / 3;

        System.out.println("\nDentre os números: " + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + ":");
        System.out.println("A soma é: " + soma);
        System.out.println("A média dos números é: " + media);

        
        scanner.close();
    }
}

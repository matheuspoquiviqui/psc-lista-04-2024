import java.util.Scanner;
public class Ativ07 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, n4, n5, maior, menor;

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

        maior = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4,n5))));

        menor = Math.min(n1,  Math.min(n2, Math.min(n3, Math.min(n4,n5))));

        System.out.println("\nDentre os números: " + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5 + ":");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é o: " + menor);

        scanner.close();
    }
}

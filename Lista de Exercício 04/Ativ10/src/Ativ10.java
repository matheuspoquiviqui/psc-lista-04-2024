import java.util.Scanner;
public class Ativ10 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int n1, n2, maior, menor, meio;

        System.out.print("Escreva o primeiro número inteiro: ");
        n1 = scanner.nextInt();
        System.out.print("Escreva o segundo número inteiro: ");
        n2 = scanner.nextInt();

        maior = Math.max(n1,n2);
        menor = Math.min(n1,n2);

        System.out.println("Entre [" + menor + ", " + maior + "] estão os seguintes números:");
        for (meio = menor; meio <= maior; meio++) {
            System.out.println(meio + " ");           
        }
        scanner.close();
    }
}

import java.util.Scanner;
public class Ativ01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Escreva uma nota de 0  10: ");
            nota = scanner.nextDouble();
            if (nota <0 || nota > 10 ){
                System.err.println("Erro: Nota inválida! Por favor digite uma nota de 0 a 10!");
            }
        } while  (nota < 0 || nota > 10);
            System.out.println("Nota válida digitada: " + nota);

            
        scanner.close();
    }
}

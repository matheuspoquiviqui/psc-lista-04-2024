import java.util.Scanner;

public class Ativ05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B. \nInforme o número de habitantes e as taxas anual de crescimento.");
        
        while (true) {
            int habitantesA = 0;
            while (habitantesA <= 0) {
                System.out.print("Informe a população do país A: ");
                if (scanner.hasNextInt()) {
                    habitantesA = scanner.nextInt();
                    if (habitantesA <= 0) {
                        System.out.println("A população deve ser um número inteiro positivo.");
                    }
                } else {
                    System.out.println("Por favor, insira um número inteiro válido para a população.");
                    scanner.next(); 
                }
            }
            
            double taxaA = 0;
            while (taxaA <= 0) {
                System.out.print("Informe a taxa de crescimento anual do país A (em decimal, por exemplo, 0.03 para 3%): ");
                if (scanner.hasNextDouble()) {
                    taxaA = scanner.nextDouble();
                    if (taxaA <= 0) {
                        System.out.println("A taxa de crescimento deve ser um número positivo.");
                    }
                } else {
                    System.out.println("Por favor, insira um número válido para a taxa de crescimento.");
                    scanner.next(); 
                }
            }
            
            int habitantesB = 0;
            while (habitantesB <= 0) {
                System.out.print("Informe a população do país B: ");
                if (scanner.hasNextInt()) {
                    habitantesB = scanner.nextInt();
                    if (habitantesB <= 0) {
                        System.out.println("A população deve ser um número inteiro positivo.");
                    }
                } else {
                    System.out.println("Por favor, insira um número inteiro válido para a população.");
                    scanner.next(); 
                }
            }
            
            double taxaB = 0;
            while (taxaB <= 0) {
                System.out.print("Informe a taxa de crescimento anual do país B (em decimal, por exemplo, 0.015 para 1.5%): ");
                if (scanner.hasNextDouble()) {
                    taxaB = scanner.nextDouble();
                    if (taxaB <= 0) {
                        System.out.println("A taxa de crescimento deve ser um número positivo.");
                    }
                } else {
                    System.out.println("Por favor, insira um número válido para a taxa de crescimento.");
                    scanner.next(); 
                }
            }
            
            int anos = 0;
            while (habitantesA <= habitantesB) {
                habitantesA += habitantesA * taxaA;
                habitantesB += habitantesB * taxaB;
                anos++;
            }
            
            System.out.println("\nNúmero de anos necessários para que a população do país A ultrapasse ou iguale a população do país B: " + anos);
            
            System.out.println("Deseja calcular novamente? (Digite 's' para sim ou qualquer outra tecla para sair)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
        
        scanner.close();
    }
}

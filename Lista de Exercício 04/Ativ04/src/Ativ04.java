public class Ativ04 {
    public static void main(String[] args) {

        int habitantesA = 80000, habitantesB = 200000;
        double taxaA = 0.03, taxaB = 0.0015;
        int anos = 0;
        
        while (habitantesA <= habitantesB) {
            habitantesA += habitantesA * taxaA;
            habitantesB += habitantesB * taxaB;
            anos++;
            System.out.println("Ano " + anos + ": População do país A: " + habitantesA + " habitantes. População do país B: " + habitantesB + " habitantes.");
        }
        
        System.out.println("\nNúmero de anos necessários para que a população do país A ultrapasse ou iguale a população do país B: " + anos);
    }
}
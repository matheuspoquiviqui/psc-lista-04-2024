public class Ativ06 {
    public static void main(String[] args) throws Exception {
    int numero = 1;

       System.out.println("Números menores e iguais a 20, linha a linha: ");

       for (numero = 1; numero <= 20; numero++) {
        System.out.println(numero);
       }       
       
       System.out.println("\nNúmeros menores e iguais a 20, lado a lado:");

        for (numero = 1; numero <= 20; numero++) {
            System.out.print(numero + " ");
        }
    
    }
}

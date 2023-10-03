import java.util.Scanner;

public class Local {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ancho del local: ");
        int ancho = entrada.nextInt();

        System.out.println("Largo del local: ");
        int largo = entrada.nextInt();

        System.out.println("Dimension baldosa(m2): ");
        int dimensionBaldosa = entrada.nextInt();

        System.out.println("Nº de baldosas: ");
        int numeroBaldosas = entrada.nextInt();

        entrada.close();

        int superficieLocal = largo * ancho;
        int totalBaldosa = dimensionBaldosa * numeroBaldosas;

        System.out.println((totalBaldosa >= superficieLocal) ? "Verdadero" : "Falso");






    }
}

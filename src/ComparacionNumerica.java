import java.util.Scanner;

public class ComparacionNumerica {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();

        entrada.close();

        String menorCero = "El número" + x + " es menor que cero.";
        String ceroCien  = "El número" + x + " está entre 0 y 100.";
        String mayorCien = "El número" + x + " es mayor que 100";

        System.out.println ((x < 0) ? menorCero : ( ( x > 100) ? mayorCien : ceroCien));



    }
}
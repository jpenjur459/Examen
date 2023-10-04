import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte el valor de a ");
        int valor_a = entrada.nextInt();

        System.out.println("inserte el valor de b ");
        int valor_b = entrada.nextInt();

        System.out.println("inserte el valor de c ");
        int valor_c = entrada.nextInt();

        int resultado1 = valor_a * valor_b + valor_c * ((3-valor_a)/2*valor_b);
        System.out.println("el valor de la operación a es"+resultado1);

        int resultado2 = ((2 + valor_a * valor_b)/4 )^(valor_c + 2);
        System.out.println("el valor de la operación b es"+resultado2);


    }
}

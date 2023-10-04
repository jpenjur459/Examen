import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserte el numero de pizzas que han encargado");
        int numeropizzas = entrada.nextInt();

        System.out.println("Inserte el numero de amigos");
        int numeroamigos = entrada.nextInt();

        System.out.println("Inserte las proporciones en las que se divide cada pizza");
        int numeroporciones = entrada.nextInt();

        int proporciones = (numeroamigos / numeropizzas * numeroporciones);

        //int sobrante = %proporciones ;

        //System.out.println("el numero de procorciones para cada uno es " + proporciones + "el numero de los trozos que sobran son " + sobrante) ;

    }
}

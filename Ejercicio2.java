import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte los ºC: ");
        int grados = entrada.nextInt();
        System.out.println("inserte a que unidad los quiere pasar");
        int unidad = entrada.nextInt();

        double Kelvin = ( grados + 273.15 );
        int fahrenheit = ((9/5) * grados + 32);

         //String (unidad = f) ? fahrenheit : "Este valor no exixte";
         //String (unidad = k) ? Kelvin : "Este valor no exixte";

    }
}

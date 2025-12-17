import java.util.Scanner;

public class Metodos {

    public static String nombresCorredores (String nombreIngeniero) {
        Scanner sc = new Scanner(System.in);
        String nombre1 = "Hamilton";
        String nombre2 = "Verstappen";
        String nombre3 = "Schumacher";
        String nombre4 = "Fernando Alonso";
        System.out.println("1. " + nombre1);
        System.out.println("2. " + nombre2);
        System.out.println("3. " + nombre3);
        System.out.println("4. " + nombre4);

        int eleccionCorredor = sc.nextInt();
        String corredorSeleccionado = "";

        if (eleccionCorredor == 1) {
            corredorSeleccionado = nombre1;
            System.out.println(nombre1 + " confía plenamente en tus instrucciones, " + nombreIngeniero);
        } else if (eleccionCorredor == 2) {
            corredorSeleccionado = nombre2;
            System.out.println(nombre2 + " confía plenamente en tus instrucciones, " + nombreIngeniero);
        } else if (eleccionCorredor == 3) {
            corredorSeleccionado = nombre3;
            System.out.println(nombre3 + " confía plenamente en tus instrucciones, " + nombreIngeniero);
        } else {
            corredorSeleccionado = nombre4;
            System.out.println(nombre4 + " confía plenamente en tus instrucciones, " + nombreIngeniero);
        }
        return corredorSeleccionado;
    }

}

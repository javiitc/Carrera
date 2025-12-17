import java.util.Random;
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

    public static int inicioCarrera (String nombreIngeniero, String corredorSeleccionado) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int posicionInicial = random.nextInt(1, 11);
        int posicion = posicionInicial;
        if (posicionInicial <= 3) {
            System.out.println(corredorSeleccionado + " ha empezado con buen pie y esta en " + posicionInicial + " lugar!");
            System.out.println("Asegurate de mantener la posición y de ganar la carrera!");
        } else if (posicionInicial <= 7) {
            System.out.println(corredorSeleccionado + " no ha comenzado del todo bien y está en " + posicionInicial + " lugar");
            System.out.println("Aún no está todo perdido, puedes asegurarte un buen lugar en la carrera!");
        } else if (posicionInicial <= 10) {
            System.out.println(corredorSeleccionado + " ha comenzado de muy mala manera y está en " + posicionInicial + " lugar");
            System.out.println("Aunque todo parezca perdido, aún puedes remontar esta carrera, ve a por ello!");
        }

        return posicion;
    }

    public static void Carrera(String nombreIngeniero, String corredorSeleccionado, int posicion) {
        System.out.println("Ahora depende de tus instrucciones que " + corredorSeleccionado + " pueda ganar esta carrera. \n" +
                "Dale las directrices necesarias, pero cuidado, depende que direcciones des puede generar más o menos estrés en " + corredorSeleccionado +"\n" +
                "Si el nivel de estrés llega a más de 80 " + corredorSeleccionado + " podrá chocarse y la carrera finalizará." );
        int nivelEstres = 10;
        boolean carrera = true;
        while (carrera) {
            System.out.println("Elige la instrucción que quieres darle a " + corredorSeleccionado);
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
        }
    }
}

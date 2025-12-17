import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public static String nombresCorredores (String nombreIngeniero) {
        Scanner sc = new Scanner(System.in);
        String nombre1 = "Rayo Mcqueen";
        String nombre2 = "Doc Hudson";
        String nombre3 = "Francesco Bernoulli";
        String nombre4 = "Jackson Storm";
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

        int posicionInicial = random.nextInt(1, 16);
        int posicion = posicionInicial;
        if (posicionInicial <= 5) {
            System.out.println(corredorSeleccionado + " ha empezado con buen pie y esta en " + posicionInicial + " lugar!");
            System.out.println("Asegurate de mantener la posición y de ganar la carrera!");
        } else if (posicionInicial <= 10) {
            System.out.println(corredorSeleccionado + " no ha comenzado del todo bien y está en " + posicionInicial + " lugar");
            System.out.println("Aún no está todo perdido, puedes asegurarte un buen lugar en la carrera!");
        } else if (posicionInicial <= 15) {
            System.out.println(corredorSeleccionado + " ha comenzado de muy mala manera y está en " + posicionInicial + " lugar");
            System.out.println("Aunque todo parezca perdido, aún puedes remontar esta carrera, ve a por ello!");
        }

        return posicion;
    }

    public static void Carrera(String nombreIngeniero, String corredorSeleccionado, int posicion) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ahora depende de tus instrucciones que " + corredorSeleccionado + " pueda ganar esta carrera. \n" +
                "Dale las directrices necesarias, pero cuidado, depende que direcciones des puede generar más o menos estrés en " + corredorSeleccionado +"\n" +
                "Si el nivel de estrés llega a más de 80 " + corredorSeleccionado + " podrá chocarse y la carrera finalizará." );

        int nivelEstres = 10;
        boolean carrera = true;
        String opcion1 = "Paciente";
        String opcion2 = "Agresivo";
        String opcion3 = "Temerario";

        while (carrera) {
            System.out.println("Cómo quieres que actúe " + corredorSeleccionado + "?");
            System.out.println(opcion1);
            System.out.println(opcion2);
            System.out.println(opcion3);

            String instruccionElegida = sc.next();
            int posicionesPerdidas = random.nextInt(0,4);
            int posicionesGanadas = random.nextInt(0, 3);
            int posicionesObtenidasTemerarias = random.nextInt(1, 5);
            int nivelEstresReducido = random.nextInt(30, 50);
            int nivelEstresObtenido = random.nextInt(20, 40);
            int nivelEstresTemerariamente = random.nextInt(30, 60);
            if (instruccionElegida.equalsIgnoreCase(opcion1)) {
                if (posicionesPerdidas == 0) {
                    if (nivelEstres >= 0) {
                        nivelEstres -= nivelEstresReducido;
                    } else if (nivelEstres < 0) {
                        nivelEstres = 0;
                    }
                    System.out.println(corredorSeleccionado + " no ha perdido posiciones, se mantiene en " + posicion + " lugar");
                    System.out.println(corredorSeleccionado + " ha reducido su estrés");
                } else {
                    if (nivelEstres >= 0) {
                        nivelEstres -= nivelEstresReducido;
                    } else if (nivelEstres < 0) {
                        nivelEstres = 0;
                    }
                    posicion -= posicionesPerdidas;
                    System.out.println(corredorSeleccionado + " ha sido adelantado y ahora está en " + posicion + " lugar");
                    System.out.println(corredorSeleccionado + " ha reducido su estrés");
                }
            } else if (instruccionElegida.equalsIgnoreCase(opcion2)) {

            }
        }
    }
}

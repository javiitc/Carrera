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
        int accionesRealizadas = 0;
        int maxAcciones = 20;
        boolean carrera = true;
        String opcion1 = "Paciente";
        String opcion2 = "Agresivo";
        String opcion3 = "Temerario";

        while (accionesRealizadas < maxAcciones) {

            System.out.println("Cómo quieres que actúe " + corredorSeleccionado + "?");
            System.out.println(opcion1);
            System.out.println(opcion2);
            System.out.println(opcion3);

            String instruccionElegida = sc.next();

            int posicionesPerdidas = random.nextInt(0,4);
            int posicionesGanadas = random.nextInt(0, 3);
            int posicionesObtenidasTemerarias = random.nextInt(2, 5);
            int nivelEstresReducido = random.nextInt(30, 50);
            int nivelEstresObtenido = random.nextInt(20, 31);
            int nivelEstresTemerariamente = random.nextInt(30, 61);

            if (instruccionElegida.equalsIgnoreCase(opcion1)) {
                if (posicionesPerdidas == 0) {
                    nivelEstres -= nivelEstresReducido;
                    System.out.println(corredorSeleccionado + " no ha perdido posiciones, se mantiene en " + posicion + " lugar");
                    System.out.println(corredorSeleccionado + " ha reducido su estrés");
                    if (nivelEstres < 0) {
                        nivelEstres = 0;
                    }
                } else {
                    nivelEstres -= nivelEstresReducido;
                    posicion += posicionesPerdidas;
                    System.out.println(corredorSeleccionado + " ha sido adelantado y ahora está en " + posicion + " lugar");
                    System.out.println(corredorSeleccionado + " ha reducido su estrés");
                    if (nivelEstres < 0) {
                        nivelEstres = 0;
                    }
                }

            } else if (instruccionElegida.equalsIgnoreCase(opcion2)) {
                if (posicionesGanadas == 0) {
                    nivelEstres += nivelEstresObtenido;
                    System.out.println(corredorSeleccionado + " no ha logrado adelantar a nadie, se mantiene en " + posicion + " lugar");
                    System.out.println("Sin embargo, su estrés ha aumentado");
                    if (nivelEstres > 100) {
                        nivelEstres = 100;
                    }
                } else {
                    posicion -= posicionesGanadas;
                    nivelEstres += nivelEstresObtenido;
                    if (posicion < 1) {
                        posicion = 1;
                    }
                    System.out.println(corredorSeleccionado + " ha logrado adelantar y ahora se encuentra en " + posicion + " lugar, sigue así!");
                    System.out.println("El estrés de " + corredorSeleccionado + " ha aumentado");
                    if (nivelEstres > 100) {
                        nivelEstres = 100;
                    }
                }

            } else if (instruccionElegida.equalsIgnoreCase(opcion3)) {
                posicion += posicionesObtenidasTemerarias;
                nivelEstres += nivelEstresTemerariamente;

                System.out.println(corredorSeleccionado + " ha hecho unas cuantas maniobras poniendo en riesgo su integridad física pero ha logrado adelantar puestos");
                System.out.println("Ahora " + corredorSeleccionado + " se encuentra en " + posicion + " lugar");
                System.out.println("Su estrés ha aumentado considerablemente");
            }

            accionesRealizadas++;

            if (nivelEstres > 80) {
                int probabilidadChoque = random.nextInt(1, 101); // 1 a 100
                if (probabilidadChoque <= 40) {
                    System.out.println("CHOQUE EN MEDIO DE LA CARRERA!");
                    System.out.println(corredorSeleccionado + " ha perdido el control del vehículo debido al estrés acumulado!");
                    System.out.println("LA CARRERA HA TERMINADO ");
                    System.out.println("Posición final: " + posicion);
                    System.out.println("Trata de ser más precavido la próxima vez " + nombreIngeniero + " o volverás a generar un accidente a tu corredor");
                    return;
                }

            }
        }
    }
}

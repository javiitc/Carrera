import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean carrera = true;
        System.out.println("Introduce tu nombre: ");
        String nombreIngeniero = sc.next();

        System.out.println("Elige al corredor al que darás instrucciones: ");
        String corredorSeleccionado = Metodos.nombresCorredores(nombreIngeniero);

        System.out.println("=======================");
        System.out.println("   INICIO DE CARRERA   ");
        System.out.println("=======================");

        Metodos.inicioCarrera(nombreIngeniero, corredorSeleccionado);
    }
}

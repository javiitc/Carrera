import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean carrera = true;
        System.out.println("Introduce tu nombre: ");
        String nombreIngeniero = sc.next();

        System.out.println("Elige al corredor al que darás instrucciones: ");
        Metodos.nombresCorredores(nombreIngeniero);
    }
}

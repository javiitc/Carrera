import java.util.Scanner;

public class Metodos {
    int eleccionCorredor;

    public static void nombresCorredores (int eleccionCorredor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Hamilton");
        System.out.println("2. Verstappen");
        System.out.println("3. Schumacher");
        System.out.println("4. Fernando Alonso");

        eleccionCorredor = sc.nextInt();

        
    }
}

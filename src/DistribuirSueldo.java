import java.util.Scanner;

public class DistribuirSueldo {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su salario:");
        float sueldo = teclado.nextFloat();

        float necesidades = sueldo * 0.5f;
        float deseos = sueldo * 0.3f;
        float ahorro = sueldo * 0.2f;

        System.out.println("\nNecesidades: " + necesidades);
        System.out.println("Deseos: " + deseos);
        System.out.println("Ahorro: " + ahorro);
    }
}

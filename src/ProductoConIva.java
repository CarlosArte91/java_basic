import java.util.Scanner;

public class ProductoConIva {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto:");

        float IVA = 0.21f;
        float valorDelProducto = teclado.nextFloat();

        float ivaDelProducto = valorDelProducto * IVA;
        float totalAPagar = valorDelProducto + ivaDelProducto;

        System.out.println("---------- DATOS DE LA COMPRA ----------");
        System.out.println("\nSubtotal__________" + valorDelProducto);
        System.out.println("IVA_______________" + ivaDelProducto);
        System.out.println("Total a pagar_____" + totalAPagar);
    }
}

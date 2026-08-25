import java.util.HashMap;
import java.util.Scanner;

public class EjercicioP03 {

    public static void main(String[] args) {

        HashMap<String, Double> productos = new HashMap<>();

        productos.put("Arroz", 4000.0);
        productos.put("Leche", 3500.0);
        productos.put("Pan", 2000.0);

        Scanner teclado = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Consultar precio");
            System.out.println("3. Actualizar precio");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {

                System.out.print("Ingrese el producto: ");
                String producto = teclado.nextLine();

                System.out.print("Ingrese el precio: ");
                double precio = teclado.nextDouble();
                teclado.nextLine();

                productos.put(producto, precio);

                System.out.println("Producto agregado correctamente.");

            } else if (opcion == 2) {

                System.out.print("Ingrese el producto: ");
                String producto = teclado.nextLine();

                if (productos.containsKey(producto)) {
                    System.out.println("El precio es: " + productos.get(producto));
                } else {
                    System.out.println("Producto no encontrado.");
                }

            } else if (opcion == 3) {

                System.out.print("Ingrese el producto: ");
                String producto = teclado.nextLine();

                if (productos.containsKey(producto)) {

                    System.out.print("Ingrese el nuevo precio: ");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();

                    productos.put(producto, precio);

                    System.out.println("Precio actualizado.");

                } else {
                    System.out.println("Producto no encontrado.");
                }

            } else if (opcion == 4) {

                System.out.print("Ingrese el producto: ");
                String producto = teclado.nextLine();

                if (productos.containsKey(producto)) {
                    productos.remove(producto);
                    System.out.println("Producto eliminado.");
                } else {
                    System.out.println("Producto no encontrado.");
                }

            } else if (opcion == 5) {

                System.out.println("Programa terminado.");
                break;

            } else {

                System.out.println("Opcion no valida.");
            }
        }

        teclado.close();
    }
}
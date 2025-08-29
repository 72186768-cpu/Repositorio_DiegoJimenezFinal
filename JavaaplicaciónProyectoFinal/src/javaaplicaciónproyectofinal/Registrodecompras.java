import java.util.Scanner;

public class Registrodecompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la primera compra: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese la segunda compra: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese la tercera compra: ");
        double compra3 = sc.nextDouble();

        // Cálculos
        double total = compra1 + compra2 + compra3;
        double promedio = total / 3;

        // Resultados
        System.out.println("==========TOTAL========");
        System.out.println("\nCliente: " + nombre);
        System.out.println("Total de compras   : " + total);
        System.out.println("Promedio de compras: " + promedio);
    }
}


import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la factura:");
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto:");
        Double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto:");
        Double precio2 = scanner.nextDouble();

        Double total = precio1+precio2;
        Double impuesto = 0.19*total;
        Double totalConImpuesto=total+impuesto;

        System.out.println("La factura "+nombreFactura+" tiene un total bruto de "+total+", con un impuesto de "+impuesto+" y el monto después de impuesto es de "+totalConImpuesto);

    }
}

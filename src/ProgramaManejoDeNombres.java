import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del familiar 1");
        String nombreFamiliar1 = scanner.nextLine();
        long inicio = System.currentTimeMillis();
        String nombreFamiliar1Str = String.valueOf(nombreFamiliar1.toUpperCase().charAt(1)).concat(".").concat(String.valueOf(nombreFamiliar1.substring(nombreFamiliar1.length()-2)));
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);

        long inicio2 = System.currentTimeMillis();
        String nombreFamiliar11Str = nombreFamiliar1.toUpperCase().charAt(1)+"."+nombreFamiliar1.substring(nombreFamiliar1.length()-2);
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2-inicio2);
        System.out.println("Ingrese el nombre del familiar 2");
        String nombreFamiliar2 = scanner.nextLine();
        String nombreFamiliar2Str = String.valueOf(nombreFamiliar2.toUpperCase().charAt(1)).concat(".").concat(String.valueOf(nombreFamiliar2.substring(nombreFamiliar2.length()-2)));

        System.out.println("Ingrese el nombre del familiar 3");
        String nombreFamiliar3 = scanner.nextLine();
        String nombreFamiliar3Str = String.valueOf(nombreFamiliar3.toUpperCase().charAt(1)).concat(".").concat(String.valueOf(nombreFamiliar3.substring(nombreFamiliar3.length()-2)));
    
        String resultado=nombreFamiliar1Str.concat("_").concat(nombreFamiliar2Str).concat("_").concat(nombreFamiliar3Str);
        System.out.println("resultado = " + resultado);
    }
}

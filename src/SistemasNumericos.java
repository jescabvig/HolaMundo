import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal= Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            //return;
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de "+numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110; // añadir 0b delante para decir que es binario
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036; // añadir 0 deante para decir que es octal
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hex de " + numeroDecimal + " = "+Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1e;// añadir 0x deante para decir que es hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje +="\n"+resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        String curso2 = new String ("Programación Java");
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

        curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);
        String resultado = curso.concat(profesor);
        resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        
        String resultado3 =  resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);
        

    }
}

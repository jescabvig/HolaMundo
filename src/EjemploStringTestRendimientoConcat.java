public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i < 10000; i++){
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 3ms
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 8ms, 10000 => 221ms
            // c += a + b + "\n"; // 500 => 28ms, 1000 => 31ms, 10000 => 131ms

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}

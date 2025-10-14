public class Main {
    public static void main(String[] args) {
        int resultado = suma(5,3);
        System.out.println("la suma es: " + resultado);
    }

    public static int suma(int a, int b) {
        return a + b;
        /* tambien funcionaria
         * int s;
         * s= a + b;
         * return s;
         */
    }
}

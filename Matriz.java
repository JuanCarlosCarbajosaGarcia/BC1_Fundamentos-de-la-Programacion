public class Matriz {
    public static void main(String[] args) {
        int[] numeros = {5,8,6,131};
        int resultado = suma(numeros);
        int mayor = max(numeros);
        int menor = min(numeros);

        /*
        //muestra array
        for (int i = 0;i<numeros.length;i++){
            System.out.print(numeros [i] + " ");
        }
        */

        //variable del while
        int inicio = 0;

        while (inicio < numeros.length) {
            System.out.print(numeros [inicio] + " ");
            inicio++;
        }

        //crea separacion
        System.out.println("");

        System.out.println("La suma es " + resultado);
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
    }
    //suma elementos
    public static int suma(int[] num){
        int s = 0;
        for (int i = 0; i < num.length; i++){
            s += num[i];
        }
        return s;
    }
    //encuentra maximo
    public static int max(int[] num){
        int max = num [0];
        for (int i = 1; i< num.length; i++){
            if(num[i]>max){
                max= num[i];
            }
        }
        return max;
    }
    //encuentra minimo
    public static int min(int[] num){
        int min = num [0];
        for (int i = 1; i< num.length; i++){
            if(num[i]<min){
                min= num[i];
            }
        }
        return min;
    }
}

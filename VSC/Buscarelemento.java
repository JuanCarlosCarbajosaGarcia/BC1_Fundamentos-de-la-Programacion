package VSC;

import java.util.Scanner;

public class Buscarelemento {
    public static void main(String[] args) {
        //int[numeros = {4,3,9,5}]
        int [] numeros = new int[6];
        
        //crear scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce 6 numeros enteros: ");

        for (int i=0; i< numeros.length; i ++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("introduce el numero a buscar: ");
        int buscar = scanner.nextInt();
        
        int posicion = 1;
        //buscar numero
        for (int i = 0; i<numeros.length; i++){
            if (numeros [i] == buscar){
                posicion = i+1;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("el numero " + buscar + " se encuentra en la posicion " + posicion);
        }else {
            System.out.println("el numero " + buscar + " no se encuentra el el array.");
        }
    scanner.close();
    }
}

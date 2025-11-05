package VSC;

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres= new String[3];

        //limpiar buffer
        scanner.nextLine();

        //introducir nombre
        for (int i = 0; i< 3; i ++){
            System.out.print("introducca el nombre: " + (i+1) + " :");
            nombres[i] = scanner.nextLine();
        }
        //almacenamos los nombres y los mostramos
        System.out.println("los nombres introducidos son: ");
        for (String nombre : nombres){
            System.out.println(nombre);
        }

    scanner.close();
    }
}

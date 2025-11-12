package BC1;

import java.util.Scanner;

public class Fibionacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el orden de sucesion fibionacci; ");
        int orden=scanner.nextInt();

        if (orden<=0) {
            System.out.println("introducca numero positivo: ");
        }else{
            System.out.println("sucesion Fibionacci " + orden + ":");
            int a=0, b=1;
            for(int i=0;i <orden; i++){
            System.out.println(a+ " ");
            int siguiente= a+b;
            a=b;
            b=siguiente;        
            }
            System.out.println();
        }

        scanner.close();
    }
}

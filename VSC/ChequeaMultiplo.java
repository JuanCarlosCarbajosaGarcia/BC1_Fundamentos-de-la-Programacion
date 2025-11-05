package VSC;

import java.util.Scanner;

public class ChequeaMultiplo {
    
    public int multiplo;
    public ChequeaMultiplo (int multiplo) {
        this.multiplo= multiplo;
    }

    public boolean EsMult (int numero) {
        if (multiplo==0) {
            return false;
        }
        return numero%multiplo ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("inserte numero a comprobar: ");
        int multintro=sc.nextInt();

        ChequeaMultiplo check = new ChequeaMultiplo(multintro);

        System.out.println("inserte multiplo a comprobar: ");
        int numover=sc.nextInt();

        if (check.EsMult(numover)) {
            System.out.println(numover + " es multiplo de " + multintro);            
        }else{
            System.out.println(numover + " no es multiplo de " + multintro);
        }
        sc.close();
    }
    
}
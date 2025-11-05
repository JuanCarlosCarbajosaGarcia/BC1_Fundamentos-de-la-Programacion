package BC1;

public class SumaDiagonal {
    public static void main(String[] args) {

        int[][] matriz ={{6, 5, 4},{8, 9, 3},{7, 1, 2}};
     
        /*int suma = 0;

        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j] + " ");
                if (i==j) {
                    suma += matriz[i][j];
                }
            }
        System.out.println("");
        }
        System.out.println("la suma es: " + suma);
        */
        int SumaDiagonal = SDp(matriz);
        System.out.println("la suma diagonal principal es: " + SumaDiagonal);
    }
    public static int SDp(int[][] matriz){
        int suma = 0;
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz.length;j++){
                if (i==j) {
                    suma += matriz[i][j];        
                }
            }
        }
        return suma;
    }
}

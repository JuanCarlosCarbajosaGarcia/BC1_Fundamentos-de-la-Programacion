public class SumaArray {
    public static void main(String[] args) {
        int[] numeros={1,2,3,43};
        int resultado = suma(numeros);
        //int resultado = suma(1,2,3,4,5,6,7,8,9,10);
        System.out.println("la suma es: " + resultado);
    }



    public static int suma(int[] num){
        int s = 0;
        for (int i = 0; i < num.length; i++){
            s += num[i];
        }
        return s;
    }
    /*public static int suma(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j)
    * s= a+ b+ c+ d+ e+ f+ g+ h+ i+ j 
    */
}

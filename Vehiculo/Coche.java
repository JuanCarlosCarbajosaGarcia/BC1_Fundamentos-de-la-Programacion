package Vehiculo;

public class Coche extends Vehiculo{
    int NumPuertas;
    public Coche(int numPuertas) {
        super(marca, modelo, anio);
        this.NumPuertas = NumPuertas;
    }

    public void mostrarCoche(){
        System.out.println(getMarca()+" "+getModelo()+" "+getAnio);
        System.out.println("NumPuertas: " + NumPuertas);
    }
}
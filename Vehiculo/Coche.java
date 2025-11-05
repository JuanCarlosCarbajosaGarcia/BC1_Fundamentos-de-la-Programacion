package Vehiculo;

public class Coche extends Vehiculo{
    int NumPuertas;
    public Coche(int NumPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.NumPuertas = NumPuertas;
    }
}

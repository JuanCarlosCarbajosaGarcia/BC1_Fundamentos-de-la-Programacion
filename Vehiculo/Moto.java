package Vehiculo;

public class Moto extends Vehiculo {
    int cilindrada;
    public Moto(int cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
}

package Vehiculo;

public class Moto extends Vehiculo {
    int cilindrada;
    public Moto(int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    public void MostrarMoto() {
        System.out.println(getMarca()+" "+getModelo()+" "+getAnio);
        System.out.println("cilindrada: " + cilindrada);
    }
}

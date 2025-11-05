package Vehiculo;

public abstract class Vehiculo{
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarinfo() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Anio: " + anio);
    }
}

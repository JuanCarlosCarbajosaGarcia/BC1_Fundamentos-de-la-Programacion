package Animal;

public class AnimalGenerico extends Animal {
    int valor;

    public AnimalGenerico(String nombre, int edad, int valor) {
        super(nombre, edad);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Animal.AnimalGenerico{" + "valor=" + valor + '}';
    }

    @Override
    public
}

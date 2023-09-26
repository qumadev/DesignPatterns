package FactoryMethod;

public class ChefMexicano extends Restaurante {
    @Override
    public Salchipapa crearSalchipapa() {
        return new SalchipapaMexicana();
    }
}
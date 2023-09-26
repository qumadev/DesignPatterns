import FactoryMethod.*;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance("Adrian");
//        System.out.println(singleton1.getName());
//        Singleton singleton2 = Singleton.getInstance("Jhonatan");
//        System.out.println(singleton2.getName());

        Restaurante restauranteMexicano = new ChefMexicano();
        restauranteMexicano.ordenarSalchipapa();

        Restaurante restauranteColombiano = new ChefColombiano();
        restauranteColombiano.ordenarSalchipapa();

        Restaurante restauranteArgentina = new ChefColombiano();
        restauranteArgentina.ordenarSalchipapa();
    }
}
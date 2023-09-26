public class MiClase {
    public static int contadorEstatico = 0; // Atributo estático

    public MiClase() {
        contadorEstatico++; // Incrementa el contador estático en cada instancia creada
    }

    public static void main(String[] args) {
        MiClase instancia1 = new MiClase();

        System.out.println(MiClase.contadorEstatico);

        MiClase instancia2 = new MiClase();

        System.out.println(MiClase.contadorEstatico); // Imprime 2, ya que se han creado dos instancias
    }
}
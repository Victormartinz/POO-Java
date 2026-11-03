package Heranca;

public class Main {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Gato frajola = new Gato();
        frajola.miar();
        frajola.comer("Sachê");
        frajola.beberAgua();
        frajola.dormir();


    }
}

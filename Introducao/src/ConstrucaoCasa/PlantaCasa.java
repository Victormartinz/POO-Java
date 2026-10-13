package ConstrucaoCasa;

public class PlantaCasa {

    //Atributos
    int mentragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A Casa está sendo Construída:");
        System.out.println("Metragem: " + mentragem);
        System.out.println("Numero de Quartos: " + numeroQuartos);
        System.out.println("Numero de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
        System.out.println("---------------------------");
    }

    public void pintar(){
        System.out.println("A Casa foi pintada de " + cor);
    }

}
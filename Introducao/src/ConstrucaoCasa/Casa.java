package ConstrucaoCasa;

public class Casa {
    public static void main(String[] args) {

        //criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //inicializando atributos(variaveis) características da casa
        casa.mentragem = 70;
        casa.material = "Tijolo";
        casa.numeroQuartos = 3;
        casa.numeroBanheiros = 4;
        casa.cor = "Preto com beje";

        //chamando a função (métodos) da ordem;
        casa.construir();

        casa.pintar();

    }
}

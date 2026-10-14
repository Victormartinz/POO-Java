package ConstrucaoCasa;

public class Casa {
    public static void main(String[] args) {

        //criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //inicializando atributos(variaveis) características da casa
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.numeroQuartos = 3;
        casa.numeroBanheiros = 4;
        casa.corCasa = "Preto com beje";

        //chamando a função (métodos) da ordem;
        casa.construir();

        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println("Resultado da Soma de Metragem: " + resultado);

        casa.pintarQuarto("Preto");

        casa.adicionarItens("Cama e Sofá", "Geladeira, Fogão e Ventilador", "Prato, Copos e Talheres", 2350.89);
    }
}

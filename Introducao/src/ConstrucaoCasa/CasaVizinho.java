package ConstrucaoCasa;

public class CasaVizinho {
    public static void main(String[] args) {

        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem = 200;
        casaVizinho.numeroBanheiros = 3;
        casaVizinho.numeroQuartos = 2;
        casaVizinho.corCasa = "amarelo";
        casaVizinho.material = "Madeira";

        casaVizinho.construir();
        casaVizinho.pintar();


    }
}

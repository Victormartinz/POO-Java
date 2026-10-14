package ConstrucaoCasa;

public class PlantaCasa {

    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String corCasa;
    String material;

    protected void construir(){
        System.out.println("A Casa está sendo Construída:");
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero de Quartos: " + numeroQuartos);
        System.out.println("Numero de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
        System.out.println("---------------------------");
    }

    public void pintar(){
        System.out.println("A Casa foi pintada de " + corCasa);
        System.out.println("--------------------------");
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void pintarQuarto(String corQuarto){
        System.out.println("O Quarto foi pintado de: " + corQuarto);
        System.out.println("--------------------------");
    }

    public void adicionarItens(String moveis, String eletrodomesticos, String loucas, double valorGasto){
        System.out.println("Os Móveis Comprados: " + moveis);
        System.out.println("Os Eletrodomesticos Comprados: " + eletrodomesticos);
        System.out.println("As Louças Compradas: " + loucas);
        System.out.println("Valor Gasto nas compras: " + valorGasto);
    }

}
package SistemaValidacaoLanchonete;

public class CalculadoraItem {

    String nomeItem = "Pizza";
    double precoUnitario = 20.00;

    protected Double calcularTotal(Integer quantidade) {
        if (quantidade <= 0) {
            return 0.0;
        } else if (quantidade > 5) {
            Double valorDesconto = (quantidade *  precoUnitario) * 0.90;
            return valorDesconto;
        } else {
            Double valorSemDesconto = quantidade * precoUnitario;
            return valorSemDesconto;
        }
    }

     protected static Double calcularTaxaEntrega(Double distanciaKm){
        Double quilometroPercorrido = distanciaKm * 2.50;
        return quilometroPercorrido;
    }

}


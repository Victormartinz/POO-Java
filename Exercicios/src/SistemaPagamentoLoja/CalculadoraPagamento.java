package SistemaPagamentoLoja;

public class CalculadoraPagamento {

    String produto;
    Double precoUnitario;

    protected Double calcularSubtotal(Integer quantidade) {
        if (quantidade <= 0 ){
            double subtotal = 0.0;
            return subtotal;
        }else{
            double subtotal = quantidade * precoUnitario;
            return subtotal;
        }
    }

    protected Double calcularDesconto(Double subtotal, Integer quantidade){
        if (quantidade >= 10){
            return subtotal * 0.15;
        }
        return 0.0;
    }

    protected static Double calcularTaxaPagamento(Double subtotal){
        return subtotal * 0.03;
    }

    protected Double calcularTotalFinal(Integer quantidade, Double subtotal, Double desconto, Double taxaPagamento){
        if (quantidade > 0)
        return (subtotal - desconto) + taxaPagamento;
        else {
            return 0.0;
        }
    }

}

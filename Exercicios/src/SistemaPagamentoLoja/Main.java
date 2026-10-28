package SistemaPagamentoLoja;

public class Main {
    public static void main(String[] args) {

        FormatadorMoedaSimples formatador = new FormatadorMoedaSimples();
        CalculadoraPagamento calculadorPagamento = new CalculadoraPagamento();

        calculadorPagamento.produto = "teclado";
        calculadorPagamento.precoUnitario = 150.00;

        System.out.println("======= LOJA TECLADO =======");
        System.out.println("Produto: " + calculadorPagamento.produto);
        System.out.println("Valor: " + calculadorPagamento.precoUnitario);

        System.out.println("Subtotal de 10 : " + formatador.formatar(calculadorPagamento.calcularSubtotal(0)));

        System.out.println("Desconto de 10 : " + formatador.formatar(calculadorPagamento.calcularDesconto(0.0, 0)));

        CalculadoraPagamento.calcularTaxaPagamento(300.0);



    }
}

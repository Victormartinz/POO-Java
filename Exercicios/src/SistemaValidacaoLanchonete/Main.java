package SistemaValidacaoLanchonete;

public class Main {
    public static void main(String[] args) {

        CalculadoraItem calculadoraItem = new CalculadoraItem();
        FormatadorMoedaSimples formatar = new FormatadorMoedaSimples();

        System.out.println("==== LANCHONETE ====");

        System.out.println("Produto: " + calculadoraItem.nomeItem);
        System.out.println("Preço: " + formatar.formatar(calculadoraItem.precoUnitario));
        System.out.println("------------------------------------------");

        System.out.println("Total de 2 unidades: " + formatar.formatar(calculadoraItem.calcularTotal(2)));
        System.out.println("Total de 6 unidades: " + formatar.formatar(calculadoraItem.calcularTotal(6)));
        System.out.println("------------------------------------------");

        System.out.println("Taxa de Entrega(4km): " + formatar.formatar(CalculadoraItem.calcularTaxaEntrega(4.0)));
    }
}

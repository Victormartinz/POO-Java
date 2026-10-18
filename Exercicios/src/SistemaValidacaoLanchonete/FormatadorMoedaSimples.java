package SistemaValidacaoLanchonete;

public class FormatadorMoedaSimples implements FormatadorMoedas{

    @Override
    public String formatar(Double valor) {
        String valorFormatado = String.format("R$ %.2f", valor);
        return valorFormatado;
    }
}

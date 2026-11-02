package SistemaCadastroProduto;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("arroz", 20.0, 5);

        produto.exibirInformacoes();

        System.out.println("\n tentando alterar dados:");

        produto.setNomeProduto("");
        produto.setPrecoProduto(-9);
        produto.setQuantidadeProduto(-5);

        produto.exibirInformacoes();

    }
}

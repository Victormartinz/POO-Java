package SistemaCadastroProduto;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        if(nomeProduto != null && !nomeProduto.trim().isEmpty()){
            this.nomeProduto = nomeProduto;
        }else {
            System.out.println("erro: Nome do Produto inválido!");
        }
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto > 0) {
            this.precoProduto = precoProduto;
        } else {
            System.out.println("Error: Cadastre um Preço válido!");
        }

    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        if (quantidadeProduto >= 0) {
            this.quantidadeProduto = quantidadeProduto;
        } else {
            System.out.println("Error: Cadastre uma quantidade válida!");
        }
    }

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto){
        setNomeProduto(nomeProduto);
        setPrecoProduto(precoProduto);
        setQuantidadeProduto(quantidadeProduto);
    }

    public void exibirInformacoes() {
        System.out.println("Dados do produto");

        System.out.println(getNomeProduto());
        System.out.println(getPrecoProduto());
        System.out.println(getQuantidadeProduto());
    }
}

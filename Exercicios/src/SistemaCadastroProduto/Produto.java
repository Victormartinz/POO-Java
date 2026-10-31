package SistemaCadastroProduto;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto > 0){
            this.precoProduto = precoProduto;
        }else {
            System.out.println("Error: Cadastre um Preço válido!");
        }

    }

    public int getQuantidadeProduto() {
        if (quantidadeProduto >= 0){
            return quantidadeProduto;
        }else {
            System.out.println("Error: Cadastre um Preço válido!");
            return 0;
        }

    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        if (quantidadeProduto >= 0){
            this.quantidadeProduto = quantidadeProduto;
        }else {
            System.out.println("Error: Cadastre um Preço válido!");
        }
    }
}

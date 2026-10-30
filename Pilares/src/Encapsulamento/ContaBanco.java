package Encapsulamento;

public class ContaBanco {

    //atributos privados
    private String titular;
    private double saldo;

    // Getter e Setter - Métodos padrões para acessar e modificar atributos

    //Metodo para obter o titular
    public String getTitular(){
        return titular;
    }

    //Metodo para modificar o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor - com Atributos
    public ContaBanco(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor sem Atributos
    public ContaBanco() {
    }

    public ContaBanco(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}

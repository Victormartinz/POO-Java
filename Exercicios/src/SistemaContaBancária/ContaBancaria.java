package SistemaContaBancária;

public class ContaBancaria implements Conta{

    String titular;
    Double saldo;

    public void mostrarDadosTitular(){
        System.out.println("====Conta criada com sucesso!====");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("------------------------------");
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0 ){
            System.out.println("");
            System.out.println("Erro: Depósito Inválido!");
        }else{
            saldo += valor;
            System.out.println("");
            System.out.println("Depósito Realizado com Sucesso!");
            System.out.println("Saldo Atual: " + saldo);
        }
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= 0 || valor > saldo){
            System.out.println("");
            System.out.println("Erro: Saque Inválido");
        }else {
            System.out.println("");
            saldo -= valor;
            System.out.println("Saque Realizado com Sucesso!");
            System.out.println("Saldo Atual: " + saldo);
        }
    }

    @Override
    public void consultarSaldo(){
        System.out.println("");
        System.out.println("Saldo da Conta: " + saldo);
    }
}

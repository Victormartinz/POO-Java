package SistemaContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria primeiraConta = new ContaBancaria();

        primeiraConta.entradaDadosTitular();
        primeiraConta.mostrarDadosTitular();
        primeiraConta.consultarSaldo();

        primeiraConta.depositar(200.0);
        primeiraConta.consultarSaldo();

        primeiraConta.sacar(150.0);
        primeiraConta.sacar(600.0);
        primeiraConta.consultarSaldo();

    }
}

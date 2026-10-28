package SistemaContaBancaria;

public interface Conta {

    void depositar(Double valor);


    void sacar(Double valor);

    void consultarSaldo();
    
}

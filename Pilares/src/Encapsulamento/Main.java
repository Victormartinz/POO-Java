package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        ContaBanco minhaConta = new ContaBanco("Victor", 500);

        minhaConta.setTitular("Victor Martins");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoConta = minhaConta.getSaldo();

        System.out.println("O titular: " + titularConta);
        System.out.println("O Saldo: " + saldoConta);

        System.out.println("");

        ContaBanco contaMae = new ContaBanco("Cassia");

        System.out.println("Conta Mãe: " + contaMae.getTitular());
        System.out.println("Saldo: " + contaMae.getSaldo());

    }
}
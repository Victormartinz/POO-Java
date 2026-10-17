package SistemaCadastroFuncionários;

import static SistemaCadastroFuncionários.Funcionario.exibirNomeEmpresa;

public class PrimeiroFuncionario {
    public static void main(String[] args) {

        Funcionario primeiroFuncionario = new Funcionario();

        primeiroFuncionario.nomeFuncionario = "Victor";
        primeiroFuncionario.idadeFuncionario = 22;
        primeiroFuncionario.cargoFuncionario = "Suporte";
        primeiroFuncionario.salarioFuncionario = 2500.00;

        exibirNomeEmpresa();

        primeiroFuncionario.apresentarDados();

        primeiroFuncionario.verificarMaioridade();

        System.out.println("O funcionário recebe pelo menos R$ 2000.00?" + primeiroFuncionario.verificarSalario(4500));

    }
}

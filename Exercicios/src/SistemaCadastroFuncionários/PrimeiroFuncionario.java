package SistemaCadastroFuncionários;

public class PrimeiroFuncionario {
    public static void main(String[] args) {

        Main primeiroFuncionario = new Main();

        primeiroFuncionario.nomeFuncionario = "Victor";
        primeiroFuncionario.idadeFuncionario = 22;
        primeiroFuncionario.cargoFuncionario = "Suporte";


        primeiroFuncionario.ApresentarDados();

        primeiroFuncionario.verificarMaioridade();

    }
}

package SistemaCadastroFuncionários;

public class SegundoFuncionario {
    public static void main(String[] args) {

        Main segundoFuncionario = new Main();

        segundoFuncionario.nomeFuncionario = "Asafe";
        segundoFuncionario.idadeFuncionario = 20;
        segundoFuncionario.cargoFuncionario = "Autonomo";

        segundoFuncionario.ApresentarDados();

        segundoFuncionario.verificarMaioridade();

    }
}

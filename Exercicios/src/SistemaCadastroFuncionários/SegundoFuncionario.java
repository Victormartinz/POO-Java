package SistemaCadastroFuncionários;

public class SegundoFuncionario {
    public static void main(String[] args) {

        Funcionario segundoFuncionario = new Funcionario();

        segundoFuncionario.nomeFuncionario = "Asafe";
        segundoFuncionario.idadeFuncionario = 20;
        segundoFuncionario.cargoFuncionario = "Autonomo";

        segundoFuncionario.apresentarDados();

        segundoFuncionario.verificarMaioridade();

    }
}

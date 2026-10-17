package SistemaCadastroFuncionários;

public class Main {

    String nomeFuncionario;
    int idadeFuncionario;
    String cargoFuncionario;

    protected void ApresentarDados(){
        System.out.println("=======DADOS DO FUNCIONARIO=============");
        System.out.println("O Nome do Funcionario: " + nomeFuncionario);
        System.out.println("O Nome do Funcionario: " + idadeFuncionario);
        System.out.println("O Nome do Funcionario: " + cargoFuncionario);
    }

    protected void verificarMaioridade(){
        System.out.println("=======VERIFICAÇÃO===============");

        if (idadeFuncionario >= 18){
            System.out.println(nomeFuncionario + " é Maior de Idade");
        }else {
            System.out.println(nomeFuncionario + " é Menor de Idade");
        }
    }

}

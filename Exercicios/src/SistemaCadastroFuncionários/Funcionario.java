package SistemaCadastroFuncionários;

public class Funcionario {

    String nomeFuncionario;
    int idadeFuncionario;
    String cargoFuncionario;
    double salarioFuncionario;
    boolean verificacaoSalario;

    static void exibirNomeEmpresa() {
        System.out.println("Empresa: Tech Solutions");
    }

    protected void apresentarDados(){
        System.out.println("=======DADOS DO FUNCIONARIO=============");
        System.out.println("O Nome do Funcionario: " + nomeFuncionario);
        System.out.println("a idade do Funcionario: " + idadeFuncionario);
        System.out.println("O Cargo do Funcionario: " + cargoFuncionario);
        System.out.println("O Salário do Funcionario: " + salarioFuncionario);
    }

    protected void verificarMaioridade(){
        System.out.println("=======VERIFICAÇÃO===============");

        if (idadeFuncionario >= 18){
            System.out.println(nomeFuncionario + " é Maior de Idade");
        }else {
            System.out.println(nomeFuncionario + " é Menor de Idade");
        }
    }

    protected double calcularSalarioAnual(){
        return salarioFuncionario * 12;
    }

    protected boolean verificarSalario(double numero){
        if (salarioFuncionario >= numero){
            verificacaoSalario = true;
        }else{
            verificacaoSalario = false;
        }
        return verificacaoSalario;
    }
}

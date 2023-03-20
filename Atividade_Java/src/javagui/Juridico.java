package javagui;

public class Juridico extends Funcionario{
    private String oab;

    public Juridico() {
    }

    public Juridico(String oab, String cpf, String rg, String matricula, double salario, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salario, setor, id, nome, idade, genero, endereco);
        this.oab = oab;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nIdade: " + super.idade +
               "\nUF: " + super.endereco.uf.sigla +
               "\nGenero: " + super.genero +
               "\nCPF: " + super.cpf +
               "\nRG: " + super.rg +
               "\nSalario: " + super.salario +
               "\nMatrícula: " + super.matricula +
               "\nLogadouro: " + super.endereco.logadouro +
               "\nCEP: " + super.endereco.cidade +
               "\nComplemento: " + super.endereco.complemento +
               "\nNumero: " + super.endereco.numero +
               "\nOAB: " + this.oab;
    }

    public String getOab() {
        return oab;
    }

}

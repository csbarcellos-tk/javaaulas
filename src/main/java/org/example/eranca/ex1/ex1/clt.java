package org.example.eranca.ex1;

public class clt extends Pessoa {

    private String matricula;
    private String cargo;
    private Double salario;

    public clt(String nome, Integer idade, String matricula, String cargo, Double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "clt{" +
                "matricula='" + matricula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

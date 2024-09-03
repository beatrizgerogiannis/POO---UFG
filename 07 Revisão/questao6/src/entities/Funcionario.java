package entities;

public class Funcionario extends Pessoa {
    protected String matricula;
    protected double salario;

    public Funcionario(String nome, String telefone, String matricula, double salario){
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getSalario(){
        return salario;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        salario = salario + (percentual / 10) ;
        System.out.println("\nSalario atualizado.");
    }

    public double recebimentoAnual(){
        return salario * 12;
    }

}

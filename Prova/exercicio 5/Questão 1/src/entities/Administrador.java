package entities;

public class Administrador extends Funcionario {

    private double salarioMensal;

    public Administrador(String nome, String sobrenome, double salarioMensal){
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularGanhosMensais(){
        return salarioMensal;
    }

}
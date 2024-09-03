package entities;

public class Gerente extends Funcionario {
    
    private double salarioMensal;
    private double bonificação;

    public Gerente(String nome, String sobrenome, double salarioMensal, double bonificação){
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.bonificação = bonificação;
    }

    @Override
    public double calcularGanhosMensais(){
        return salarioMensal + bonificação;
    }

}

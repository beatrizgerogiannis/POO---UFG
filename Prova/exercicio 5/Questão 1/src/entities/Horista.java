package entities;

public class Horista extends Funcionario {

    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String sobrenome, double horasTrabalhadas, double valorHora){
        super(nome, sobrenome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularGanhosMensais(){
        return horasTrabalhadas * valorHora;
    }

}
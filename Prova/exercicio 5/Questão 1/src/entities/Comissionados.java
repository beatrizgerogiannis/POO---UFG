package entities;

public class Comissionados extends Funcionario {
    
    private double salarioMensal;
    private double totalVendas;
    private double percentualComissao;

    public Comissionados(String nome, String sobrenome, double salarioMensal, double totalVendas, double percentualComissao){
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularGanhosMensais(){
        return salarioMensal + (totalVendas * percentualComissao);
    }

}

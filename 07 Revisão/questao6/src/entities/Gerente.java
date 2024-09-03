package entities;

public class Gerente extends Funcionario{
    protected double bonificacao;
    protected String tipo;

    public Gerente(String nome, String telefone, String matricula, double salario, double bonificacao, String tipo) {
        super(nome, telefone, matricula, salario);
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void aumentarSalario(double percentual){
        super.aumentarSalario(percentual);
        bonificacao += bonificacao * percentual;
    }

    @Override
    public double recebimentoAnual(){
        return super.recebimentoAnual() + (bonificacao * 12);
    }

}

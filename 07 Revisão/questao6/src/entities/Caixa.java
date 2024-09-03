package entities;

public class Caixa extends Funcionario {
    protected String horario;

    public Caixa(String nome, String telefone, String matricula, double salario, String horario) {
        super(nome, telefone, matricula, salario);
        this.horario = horario;
    }

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }
}

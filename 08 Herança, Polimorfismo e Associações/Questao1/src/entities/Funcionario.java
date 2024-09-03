package entities;

public class Funcionario extends Pessoa{
    float salario;

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto(){
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("Imposto: " + calculaImposto());
    }
}

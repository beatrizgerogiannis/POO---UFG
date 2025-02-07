package entities;

public class Gerente extends Funcionario{
    String area;

    public Gerente(String nome, Data nascimento, float salario, String area){
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto(){
        return salario * 0.05f;
    }

    @Override 
    public void imprimeDados(){
        System.out.println("Gerente: " + nome);
        System.out.println("Area: " + area);
        System.out.println("Salario: " + salario);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("Imposto: " + calculaImposto());
    }
}

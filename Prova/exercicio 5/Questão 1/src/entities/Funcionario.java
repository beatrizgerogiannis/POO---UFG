package entities;

public class Funcionario {
    
    private String nome;
    private String sobrenome;

    public Funcionario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome  ;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome + " " + sobrenome);
    }

    public double calcularGanhosMensais(){
        return 0.0;
    }

}

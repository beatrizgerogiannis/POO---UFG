package entities;

public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3){
        this.nome = nome;
        this. matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculaMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public String resultadoString(){
        return ( (nota1 + nota2 + nota3) / 3 >= 7.0) ? "Aprovado" : "Reprovado";
    }

    public String toString(){
        return nome + "(Matrícula - )" + matricula + ")";
    }
}

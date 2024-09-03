package entities;

public class Cursos{

    String nome;
    String departamento;
    int numero;
    int cargaHoraria;

    public Cursos(String nome, String departamento, int numero, int cargaHoraria){
        this.nome = nome;
        this.departamento = departamento;
        this.numero = numero;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Numero: " + numero);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("\n----------------------------\n");  
    }   
}
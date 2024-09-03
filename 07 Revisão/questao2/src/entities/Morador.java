package entities;

public class Morador{

    String nome;
    String cpf;
    String celular;
    String dataNascimento;
    char sexo;
    int bloco;
    int apt;
    String codigoAcesso;

    public Morador(String nome, String cpf, String celular, String dataNascimento, char sexo, int bloco, int apt, String codigoAcesso){
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apt = apt;
        this.codigoAcesso = codigoAcesso;
    }

}
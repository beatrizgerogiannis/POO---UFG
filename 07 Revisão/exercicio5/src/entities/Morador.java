package entities;

// Classe para representar os moradores do condomínio com encapsulamento
public class Morador {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private char sexo;
    private int bloco;
    private int apartamento;
    private String codigoAcesso;
    private static int codigoSequencial = 1; // Atributo estático para gerar o código sequencial

    // Construtor
    public Morador(String nome, String cpf, String celular, String dataNascimento, char sexo, int bloco, int apartamento, String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
        this.codigoSequencial++; // Incrementa o código sequencial a cada nova instância criada
    }

    //Métodos de acesso (getters e setters)
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getBloco(){
        return bloco;
    }

    public void setBloco(int bloco){
        this.bloco = bloco;
    }

    public int getApartamento(){
        return apartamento;
    }

    public void setApartamento(int apt){
        this.apartamento = apt;
    }

    public String getCodigoAcesso(){
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso){
        this.codigoAcesso = codigoAcesso;
    }

    public int getCodigoSequencial(){
        return codigoSequencial;
    }
}
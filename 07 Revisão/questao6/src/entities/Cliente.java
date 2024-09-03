package entities;

public class Cliente extends Pessoa {
    protected int idade;
    protected String cpf;
    protected char status;

    public Cliente(String nome, String telefone, int idade, String cpf) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.status = 'A';
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public char getStatus(){
        return status;
    }

    public void setStatus(char status){
        this.status = status;
    }

    public void desativar(){
        if(status == 'A'){
            status = 'I';
        }
    }

    public String dadosCliente(){
        return nome + " - Tel: " + telefone + " - idade: " + idade + " anos - cpf: " + cpf + " - " + (status == 'A' ? "ativo" : "inativo");
    }

}

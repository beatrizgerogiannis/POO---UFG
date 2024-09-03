package entities;

public class Produto{
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    //Construtor para criar o objeto com apenas o código
    public Produto(int codigo){
        this.codigo = codigo;
    }

    //Construtor para criar o objeto com código e nome
    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    //Construtor para criar o objeto com código, nome e quantidade
    public Produto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    //Construtor para criar o objeto com todos os dados
    public Produto(int codigo, String nome, int quantidade, String tipo, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this. tipo = tipo;
        this.valor = valor;
    }

    //Método para vender produtos
    public void vender(int quantidadeVendida){
        if(quantidadeVendida <= quantidade){
            quantidade -= quantidadeVendida;

        double totalVenda = quantidadeVendida * valor;
        System.out.println("Venda realizada. Total: R$" + totalVenda);
        }else{
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    //Método para comprar produtos com quantidade e novo valor
    public void comprar(int quantidadeComprada, double novoValor){
        quantidade += quantidadeComprada;
        valor = novoValor;
    }

    //Método para comprar produtos apenas com quantidade
    public void comprar(int quantidadeComprada){
        quantidade += quantidadeComprada;
    }

    //Método para consultar informações do produto
    public String consultar(){
        return "\nCódigo: " + codigo + "\nNome: " + nome + "\nQuantidade em estoque: " + quantidade + "\nTipo: " + tipo + "\nValor: R$" + valor + "\n";
    }

    //Método para inserir novos dados do produto
    public void inserir(String nome, int quantidade, String tipo, double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    //Método para verificar se dois produtos são iguais
    public boolean igual(Produto outroProduto){
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }

}
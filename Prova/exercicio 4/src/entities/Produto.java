package entities;

public class Produto {
        int codigoSenquencial;
        String nomeProduto;
        int quantidade;
        String tipo;
        double valorProduto;

        public Produto(int codigoSenquencial){
            this.codigoSenquencial = codigoSenquencial;
        }

        public Produto(int codigoSenquencial, String nomeProduto){
            this.codigoSenquencial = codigoSenquencial;
            this.nomeProduto = nomeProduto;
        }

        public Produto(int codigoSenquencial, String nomeProduto, int quantidade){
            this.codigoSenquencial = codigoSenquencial;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
        }

        public Produto(int codigoSenquencial, String nomeProduto, int quantidade, String tipo, double valorProduto){
            this.codigoSenquencial = codigoSenquencial;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.tipo = tipo;
            this.valorProduto = valorProduto;
        }

        public void vender(int qtdVendida){
            if(quantidade <= qtdVendida){
                quantidade -= qtdVendida;

                double totalVenda = qtdVendida * valorProduto;
                System.out.println("Valor total: " + totalVenda + "$");
            }else{
                System.out.println("Quantidade insuficiente em estoque.");
            }
        }

        public void comprar(int quantidadeNova, double novoValor){
            quantidade += quantidadeNova;
            valorProduto = novoValor;
        }

        public void comprar(int quantidadeNova){
            quantidade += quantidadeNova;
        }

        public void consultar(Produto produto){
            System.out.println("\n--------------------------------");
            System.out.println("Código Sequencial: " + codigoSenquencial);
            System.out.println("Nome do Produto: " + nomeProduto);
            System.out.println("Quantidade em estoque: " + quantidade);
            System.out.println("Tipo: " + tipo);
            System.out.println("Valor do produto: " + valorProduto + "$");
            System.out.println("--------------------------------\n");
        }

        public void inserir(String nome, int quantidade, String tipo, double valor){
            this.nomeProduto = nome;
            this.quantidade = quantidade;
            this.tipo = tipo;
            this.valorProduto = valor;
        }

        public boolean igual(Produto outroProduto){
            return this.nomeProduto.equals(outroProduto.nomeProduto) && this.tipo.equals(outroProduto.tipo);
        }

}

import entities.Produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Criando objetos de Produto usando diferentes construções.
        Produto produto1 = new Produto(001);
        Produto produto2 = new Produto(002, "Jogo Master");
        Produto produto3 = new Produto(003, "Jogo Quebra-Cabeça", 30);
        Produto produto4 = new Produto(004, "Jogo Batalha Naval", 15, "Jogo", 80.00);

        //Atualizando o primeiro produto usando o método inserir.
        produto1.inserir("Jodo Twister", 10, "Jogo", 100.00);

        //Usando operações especificadas
        produto1.vender(3); //Vender 3 unidades do produto 1;
        produto2.comprar(5, 160.00); //Comprar 5 unidades do produto 2 com novo valor
        produto3.comprar(10); //Comprar 10 unidades do produto 3 sem alterar o valor
        produto4.vender(20); //Tentativa de vender 20 unidades do produto 4 (quantidade insuficiente)

        //Consultar informações dos produtos
        produto1.consultar(produto1);
        produto2.consultar(produto2);
        produto3.consultar(produto3);
        produto4.consultar(produto4);

        //Comparar produtos
        Produto outroProduto = new Produto(005, "Jogo Twister", 10, "jogo", 100.00);
        System.out.println("Produto 1 é igual a outroProduto? " + produto1.igual(outroProduto));

        scanner.close();

    }
}

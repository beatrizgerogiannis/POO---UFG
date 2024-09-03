// Definição da classe abstrata Loja
abstract class Loja implements Registro {
    protected String identificador;
    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    // Construtor da classe Loja
    public Loja(String identificador, String cnpj, String razaoSocial) {
        this.identificador = identificador;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    // Método para retornar os dados da loja
    public String getInfo() {
        return "Identificador: " + identificador + "\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial + "\nStatus: " + (aberta ? "Aberta" : "Fechada");
    }
    
    // Implementação dos métodos da interface Registro
    public void registra_abertura_dia() {
        if (!aberta)
            aberta = true;
        else
            System.out.println("A loja já está aberta.");
    }

    public void registra_fechamento_dia() {
        if (aberta)
            aberta = false;
        else
            System.out.println("A loja já está fechada.");
    }
}

// Definição da classe concreta LojaConcreta
class LojaConcreta extends Loja {
    private String endereco;
    private String gerente;

    // Construtor da classe LojaConcreta
    public LojaConcreta(String identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
        super(identificador, cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    // Método para mostrar todos os dados da loja
    public void mostrarDados() {
        System.out.println(getInfo() + "\nEndereço: " + endereco + "\nGerente: " + gerente);
    }
}

// Interface Registro
interface Registro {
    void registra_abertura_dia();
    void registra_fechamento_dia();
}

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das lojas
        Loja matriz = new LojaConcreta("Matriz", "1234567890", "Empresa XYZ", "Rua da Matriz, 123", "João");
        Loja filial1 = new LojaConcreta("Filial 1", "0987654321", "Filial 1 da Empresa XYZ", "Av. da Filial, 456", "Maria");
        Loja filial2 = new LojaConcreta("Filial 2", "9876543210", "Filial 2 da Empresa XYZ", "Praça da Filial, 789", "José");

        // Mostrando os dados das lojas
        System.out.println("Loja Matriz:");
        ((LojaConcreta) matriz).mostrarDados();
        System.out.println("\nLoja Filial 1:");
        ((LojaConcreta) filial1).mostrarDados();
        System.out.println("\nLoja Filial 2:");
        ((LojaConcreta) filial2).mostrarDados();

        // Abrindo e fechando lojas
        matriz.registra_abertura_dia();
        filial1.registra_abertura_dia();
        filial2.registra_abertura_dia();
        filial1.registra_fechamento_dia();
        filial2.registra_fechamento_dia();

        // Mostrando os dados das lojas após abertura e fechamento
        System.out.println("\nApós abertura e fechamento:");
        System.out.println("Loja Matriz:");
        ((LojaConcreta) matriz).mostrarDados();
        System.out.println("\nLoja Filial 1:");
        ((LojaConcreta) filial1).mostrarDados();
        System.out.println("\nLoja Filial 2:");
        ((LojaConcreta) filial2).mostrarDados();
    }
}

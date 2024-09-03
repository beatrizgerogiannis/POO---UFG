package entities;

public class Cadastro {
    public static void main(String[] args) {
        // Criando um funcionário caixa
        Funcionario caixa = new Funcionario("João", "1234-5678", "123", 2000);
        caixa.aumentarSalario(10); // Aumentando o salário em 10%
        System.out.println("\n------------------------------\n");
        System.out.println("\nDados do Caixa:");
        System.out.println("\nNome: " + caixa.getNome());
        System.out.println("\nTelefone: " + caixa.getTelefone());
        System.out.println("\nMatrícula: " + caixa.getMatricula());
        System.out.println("\nSalário: " + caixa.getSalario());
        System.out.println("\nRecebimento Anual: " + caixa.recebimentoAnual());
        System.out.println("\n------------------------------\n");


        // Criando um funcionário gerente
        Gerente gerente = new Gerente("Maria", "9876-5432", "456", 4000, 500, "PF");
        gerente.aumentarSalario(20); // Aumentando o salário em 20%
        System.out.println("\n------------------------------\n");
        System.out.println("\nDados do Gerente:");
        System.out.println("\nNome: " + gerente.getNome());
        System.out.println("\nTelefone: " + gerente.getTelefone());
        System.out.println("\nMatrícula: " + gerente.getMatricula());
        System.out.println("\nSalário: " + gerente.getSalario());
        System.out.println("\nBonificação: " + gerente.getBonificacao());
        System.out.println("\nTipo: " + gerente.getTipo());
        System.out.println("\nRecebimento Anual: " + gerente.recebimentoAnual());
        System.out.println("\n------------------------------\n");

        // Criando instâncias de cliente
        Cliente cliente1 = new Cliente("Ana", "1111-2222", 30, "111.222.333-44");
        Cliente cliente2 = new Cliente("Pedro", "3333-4444", 25, "222.333.444-55");
        Cliente cliente3 = new Cliente("Carla", "5555-6666", 40, "333.444.555-66");

        // Desativando um cliente
        cliente2.desativar();

        // Mostrando dados dos clientes
        System.out.println("\n------------------------------\n");
        System.out.println("\nDados do Cliente 1: " + cliente1.dadosCliente());
        System.out.println("\n------------------------------\n");
        System.out.println("\n------------------------------\n");
        System.out.println("\nDados do Cliente 2: " + cliente2.dadosCliente());
        System.out.println("\n------------------------------\n");
        System.out.println("\n------------------------------\n");
        System.out.println("\nDados do Cliente 3: " + cliente3.dadosCliente());
        System.out.println("\n------------------------------\n");
    }
}
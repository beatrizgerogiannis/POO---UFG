package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroMoradores {
    
    public static void main(String[] args) {

        List<Morador> moradores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        char continuar;

        do{
            System.out.println("Digite o nome do morador: ");
            String nome = sc.nextLine();

            System.out.println("\nDigite o cpf do morador: ");
            String cpf = sc.nextLine();

            System.out.println("\nDigite o celular do morador: ");
            String celular = sc.nextLine();

            System.out.println("\nDigite a data de nascimento do morador: ");
            String dataNascimento = sc.nextLine();

            System.out.println("\nDigite o sexo do morador: ");
            char sexo = sc.nextLine().charAt(0);

            System.out.println("\nDigite o bloco do morador: ");
            int bloco = sc.nextInt();
            
            System.out.println("\nDigite o apartamento do morador: ");
            int apt = sc.nextInt();
            sc.nextLine();

            System.out.println("\nDigite o codigo de acesso do morador: ");
            String codigoAcesso = sc.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apt, codigoAcesso);
            
            moradores.add(morador);

            System.out.println("Deseja cadastrar outro morador? (S/N)");
            continuar = sc.nextLine().charAt(0);
        }while(continuar == 'S' || continuar == 's');
        
        sc.close();

        System.out.println("Moradores Cadastrados: ");
        for(Morador morador : moradores){

            System.out.println("\n------------------------------------\n");
            System.out.println("\nNome: " + morador.getNome());
            System.out.println("\nCPF: " + morador.getCpf());
            System.out.println("\nCelular: " + morador.getCelular());
            System.out.println("\nData de Nascimento: " + morador.getDataNascimento());
            System.out.println("\nSexo: " + morador.getSexo());
            System.out.println("\nBloco: " + morador.getBloco());
            System.out.println("\nApartamento: " + morador.getApartamento());
            System.out.println("\nCódigo de Acesso: " + morador.getCodigoAcesso());
            System.out.println("\nCódigo Sequencial: " + morador.getCodigoSequencial());
            System.out.println("\n------------------------------------\n");
            System.out.println();
        }

    }
}

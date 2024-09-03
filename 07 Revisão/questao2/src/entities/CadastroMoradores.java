package entities;

import java.util.Scanner;

public class CadastroMoradores {
    
    public static void main(String[] args) {


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
        
            System.out.println("\n------------------------------------\n");
            System.out.println("\nMorador cadastrado com sucesso!");
            System.out.println("\n\nNome: " + morador.nome);
            System.out.println("\nCPF: " + morador.cpf);
            System.out.println("\nCelular: " + morador.celular);
            System.out.println("\nData de nascimento: " + morador.dataNascimento);
            System.out.println("\nSexo: " + morador.sexo);
            System.out.println("\nBloco: " + morador.bloco);
            System.out.println("\nApartamento: " + morador.apt);
            System.out.println("\nCodigo de acesso: " + morador.codigoAcesso);
            System.out.println("\n\n------------------------------------\n");
            
            System.out.println("Deseja cadastrar outro morador? (S/N)");
            continuar = sc.nextLine().charAt(0);
        }while(continuar == 'S' || continuar == 's');
        
        sc.close();

    }
}

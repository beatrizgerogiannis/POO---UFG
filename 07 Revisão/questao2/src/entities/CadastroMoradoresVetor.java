package entities;

import java.util.Scanner;

public class CadastroMoradoresVetor {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Morador[] moradores = new Morador[10];  
        int indice = 0;

        char continuar;

        do{
            System.out.println("Digite o nome do morador: ");
            String nome = sc.nextLine();

            System.out.println("Digite o cpf do morador: ");
            String cpf = sc.nextLine();

            System.out.println("Digite o celular do morador: ");
            String celular = sc.nextLine();

            System.out.println("Digite a data de nascimento do morador: ");
            String dataNascimento = sc.nextLine();

            System.out.println("Digite o sexo do morador: ");
            char sexo = sc.nextLine().charAt(0);

            System.out.println("Digite o bloco do morador: ");
            int bloco = sc.nextInt();
            
            System.out.println("Digite o apartamento do morador: ");
            int apt = sc.nextInt();

            System.out.println("Digite o codigo de acesso do morador: ");
            String codigoAcesso = sc.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apt, codigoAcesso);
        
            moradores[indice] = morador;
            indice++;

            System.out.println("Deseja cadastrar outro morador? (S/N)");
            continuar = sc.nextLine().charAt(0);
        
        }while(continuar == 'S' || continuar == 's');
        
        for(int i = 0; i<indice; i++){

            System.out.println("\n------------------------------------\n");
            System.out.println("\nMorador cadastrado com sucesso!");
            System.out.println("\nMorador " + (i+1) + ":");
            System.out.println("\n\nNome: " + moradores[i].nome);
            System.out.println("\nCPF: " + moradores[i].cpf);
            System.out.println("\nCelular: " + moradores[i].celular);
            System.out.println("\nData de nascimento: " + moradores[i].dataNascimento);
            System.out.println("\nSexo: " + moradores[i].sexo);
            System.out.println("\nBloco: " + moradores[i].bloco);
            System.out.println("\nApartamento: " + moradores[i].apt);
            System.out.println("\nCodigo de acesso: " + moradores[i].codigoAcesso);
            System.out.println("\n\n------------------------------------\n");
        }
        
        sc.close();

    }
}

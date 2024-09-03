import java.util.Scanner;

import entities.CadastroMoradores;
import entities.CadastroMoradoresVetor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nQual funcao voce deseja usar para cadastrar os moradores?");
        System.out.println("\n1- Sem vetor");
        System.out.println("2- Com vetor");
        int opcao = sc.nextInt();

        if(opcao == 1){
            CadastroMoradores.main(args);
        }else if(opcao == 2){
            CadastroMoradoresVetor.main(args);
        }else{
            System.out.println("Opcao invalida.");
        }
        sc.close();
    }
}

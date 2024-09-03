import entities.Cursos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Cursos[] cursos = new Cursos[4];

        for(int i = 0; i<=3; i++){
            System.out.println("\n\nDigite os dados para o curso " + (i+1) + " :\n");
            System.out.println("Nome do Curso: ");
            String nome = sc.nextLine();

            System.out.println("\nDepartamento: ");
            String departamento = sc.nextLine();

            System.out.println("\nNumero: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("\nCarga Horaria: ");
            int cargaHoraria = sc.nextInt();
            sc.nextLine();
                
            cursos[i] = new Cursos(nome, departamento, numero, cargaHoraria);
        }
            
        for(int i = 0; i<cursos.length; i++){
            System.out.println("Dados do curso: " + i);
            cursos[i].mostrarDados();
        }
        sc.close();
    }
}

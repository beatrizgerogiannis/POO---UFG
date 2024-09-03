import java.util.Scanner;

public class ExercLab1_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Cria objeto para leitura

        // Criando 4 instâncias de Curso
        Curso[] cursos = new Curso[4];

        // Solicitando dados para os 4 cursos
        for(int i = 0; i < cursos.length; i++) {
            System.out.println("Digite os dados para o curso " + (i+1) + ":");
            System.out.println("Nome do curso: ");
            String nome = sc.nextLine();

            System.out.println("Departamento: ");
            String departamento = sc.nextLine();

            System.out.println("Número de matricula: ");
            int numeroMatricula = sc.nextInt();
            sc.nextLine(); // Limpa buffer do scanner

            System.out.println("Carga horaria: ");
            int cargaHoraria = sc.nextInt();
            sc.nextLine();

            cursos[i] = new Curso(nome, departamento, numeroMatricula, cargaHoraria);
        }

        // Exibindo dados do curso
        for(int i = 0; i < cursos.length; i++) {
            System.out.println("\nDados do curso " + (i+1) + ":");
            cursos[i].mostrarDados();
        }

        sc.close();
    }

    public static class Curso {
        // Atributos
        public String nome;
        public String departamento;
        public int numeroMatricula;
        public int cargaHoraria;

        // Constrói informações
        public Curso(String nome, String departamento, int numeroMatricula, int cargaHoraria) {
            this.nome = nome;
            this.departamento = departamento;
            this.numeroMatricula = numeroMatricula;
            this.cargaHoraria = cargaHoraria;
        }

        // Método para exibir os dados do curso
        public void mostrarDados() {
            System.out.println("Nome do curso: " + nome);
            System.out.println("Departamento: " + departamento);
            System.out.println("Número de matrícula: " + numeroMatricula);
            System.out.println("Carga horária: " + cargaHoraria);
        }
    }
}

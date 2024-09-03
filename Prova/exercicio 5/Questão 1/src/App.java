import entities.Administrador;
import entities.Funcionario;
import entities.Gerente;
import entities.Horista;
import entities.Comissionados;


public class App {
    public static void main(String[] args) throws Exception {
        
         Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new Horista("João", "Silva", 120, 10.0);
        funcionarios[1] = new Horista("Maria",  "Santos", 140, 12.0);
        funcionarios[2] = new Administrador("José",  "Souza", 5000);
        funcionarios[3] = new Administrador("Ana",  "Ferreira", 6000);
        funcionarios[4] = new Administrador("Carlos",  "Oliveira", 4500);
        funcionarios[5] = new Administrador("Amanda",  "Costa", 5500);
        funcionarios[6] = new Comissionados("Pedro",  "Rodrigues", 3000, 20000, 0.05);
        funcionarios[7] = new Comissionados("Mariana", "Almeida", 3500, 25000, 0.06);
        funcionarios[8] = new Comissionados("Paulo", "Cunha", 3200, 18000, 0.04);
        funcionarios[9] = new Gerente("Laura", "Lima", 7000, 2000);

        for(Funcionario funcionario : funcionarios){
            System.out.println("Dados do funcionario:");
            funcionario.mostrarDados();
            System.out.println("Ganhos mensais: " + funcionario.calcularGanhosMensais());
            System.out.println();
        }
    }
}

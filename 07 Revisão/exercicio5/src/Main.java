import entities.*;

public class Main {
    public static void main(String[] args) {
        // Criando alguns moradores para associar aos apartamentos
        Morador morador1 = new Morador("Fulano", "123456789", "999999999", "01/01/2000", 'M', 1, 101, "1234");
        Morador morador2 = new Morador("Ciclano", "987654321", "888888888", "02/02/2000", 'F', 2, 202, "5678");

        // Criando alguns apartamentos e associando moradores
        Apartamento apt1 = new Apartamento("101", 1, 80.0, "alugado");
        apt1.adicionarMorador(morador1);

        Apartamento apt2 = new Apartamento("201", 2, 100.0, "quitado");
        apt2.adicionarMorador(morador2);

        // Exibindo informações dos apartamentos
        System.out.println(apt1);
        System.out.println(apt2);
    }
}

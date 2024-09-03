import entities.RoboAspirador;

public class Main {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(1, 10); // Criação do primeiro robô com limite de poeira 10
        RoboAspirador robo2 = new RoboAspirador(2, 15); // Criação do segundo robô com limite de poeira 15

        // Testando as operações do primeiro robô
        robo1.ligar();
        robo1.andar(3, 4);
        System.out.println(robo1);

        robo1.aspirar(5);
        System.out.println(robo1);

        robo1.parar();
        robo1.desligar();
        System.out.println(robo1);

        // Testando as operações do segundo robô
        robo2.ligar();
        robo2.andar(-2, -2);
        System.out.println(robo2);

        robo2.aspirar(18);
        System.out.println(robo2);

        robo2.desligar();
        System.out.println(robo2);
    }
}

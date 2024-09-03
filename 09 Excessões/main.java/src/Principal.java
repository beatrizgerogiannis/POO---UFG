import java.util.InputMismatchException;
import java.util.Scanner;

// Classe de exceção personalizada NumeroNegativo
class NumeroNegativo extends RuntimeException {
    public NumeroNegativo(String mensagem) {
        super(mensagem);
    }
}

// Classe Calculadora com os métodos para operações aritméticas
class Calculadora {
    private int num1;
    private int num2;

    // Construtor da classe Calculadora
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para soma
    public int soma() {
        return num1 + num2;
    }

    // Método para subtração
    public int subtracao() {
        return num1 - num2;
    }

    // Método para multiplicação
    public int multiplicacao() {
        return num1 * num2;
    }

    // Método para divisão
    public int divisao() {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}

// Classe Principal para receber a entrada do usuário e realizar as operações
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try {
            // Recebendo o primeiro número
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextInt();
            if (num1 < 0) {
                throw new NumeroNegativo("O número informado não pode ser negativo: " + num1);
            }

            // Recebendo o segundo número
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextInt();
            if (num2 < 0) {
                throw new NumeroNegativo("O número informado não pode ser negativo: " + num2);
            }

            // Instanciando a calculadora
            Calculadora calculadora = new Calculadora(num1, num2);

            // Realizando as operações e exibindo os resultados
            System.out.println("Soma: " + calculadora.soma());
            System.out.println("Subtração: " + calculadora.subtracao());
            System.out.println("Multiplicação: " + calculadora.multiplicacao());

            try {
                System.out.println("Divisão: " + calculadora.divisao());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
        } catch (NumeroNegativo e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

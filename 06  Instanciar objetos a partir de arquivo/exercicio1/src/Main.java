import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String arquivo = "funcionarios.txt";
        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;
        double totalImpostoGeral = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario funcionario = new Funcionario(nome, sexo, salario, dependentes);
                double imposto = funcionario.calculaImposto();
                totalImpostoGeral += imposto;

                // Mostrar os dados do funcionário na console
                System.out.println(funcionario.mostraFuncionario());

                // Somar o imposto de acordo com o sexo
                if (sexo == 'F') {
                    totalImpostoFeminino += imposto;
                } else if (sexo == 'M') {
                    totalImpostoMasculino += imposto;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Mostrar total de impostos pagos por sexo e total geral
        System.out.println("\nTotal de imposto pago por funcionárias: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago geral: " + totalImpostoGeral);
    }
}

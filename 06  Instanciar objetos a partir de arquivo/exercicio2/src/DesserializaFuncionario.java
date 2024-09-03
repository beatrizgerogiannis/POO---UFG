import entities.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DesserializaFuncionario {
    public static void main(String[] args) {
        String arquivoSaida = "funcionarios_serializados.dat";

        List<Funcionario> funcionarios = new ArrayList<>();

        // Desserializar os objetos Funcionario do arquivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivoSaida))) {
            while (true) {
                try {
                    Funcionario funcionario = (Funcionario) ois.readObject();
                    funcionarios.add(funcionario);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Repetir o resultado do item 1
        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;
        double totalImpostoGeral = 0;

        for (Funcionario funcionario : funcionarios) {
            double imposto = funcionario.calculaImposto();
            totalImpostoGeral += imposto;

            // Mostrar os dados do funcionário na console
            System.out.println(funcionario.mostraFuncionario());

            // Somar o imposto de acordo com o sexo
            if (funcionario.sexo == 'F') {
                totalImpostoFeminino += imposto;
            } else if (funcionario.sexo == 'M') {
                totalImpostoMasculino += imposto;
            }
        }

        // Mostrar total de impostos pagos por sexo e total geral
        System.out.println("\nTotal de imposto pago por funcionárias: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago geral: " + totalImpostoGeral);
    }
}

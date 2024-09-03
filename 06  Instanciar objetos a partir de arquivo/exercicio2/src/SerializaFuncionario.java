import entities.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializaFuncionario {
    public static void main(String[] args) {
        String arquivoEntrada = "funcionarios.txt";
        String arquivoSaida = "funcionarios_serializados.dat";

        List<Funcionario> funcionarios = new ArrayList<>();

        // Ler os funcionários do arquivo e criar objetos Funcionario
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario funcionario = new Funcionario(nome, sexo, salario, dependentes);
                funcionarios.add(funcionario);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Serializar os objetos Funcionario e gravar no arquivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoSaida))) {
            for (Funcionario funcionario : funcionarios) {
                oos.writeObject(funcionario);
            }
            System.out.println("Funcionários serializados com sucesso em " + arquivoSaida);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace(); // Adicionando para imprimir a stack trace completa
        }
    }
}

import java.io.*;

public class FileReaderWriter {

    // Método que cria um arquivo com conteúdo de exemplo
    public void createExampleFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Esta é a primeira linha.\n");
            writer.write("Esta é a segunda linha.\n");
            writer.write("Esta é a terceira linha.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método que lê um arquivo byte a byte, mostra na tela e grava em outro arquivo
    public void readFileByteByByte(String inputFilePath, String outputFilePath) {
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convertendo byteData para char para imprimir corretamente
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método que lê um arquivo linha a linha e mostra na tela
    public void readFileLineByLine(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        
        // Cria um arquivo de exemplo
        fileReaderWriter.createExampleFile(inputFilePath);
        
        System.out.println("Reading file byte by byte:");
        fileReaderWriter.readFileByteByByte(inputFilePath, outputFilePath);
        
        System.out.println("\n\nReading file line by line:");
        fileReaderWriter.readFileLineByLine(outputFilePath);
    }
}

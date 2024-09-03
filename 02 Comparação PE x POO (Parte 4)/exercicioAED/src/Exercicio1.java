import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int numi = 0, numf = 0;
        int soma = 0;
        int qtde = 0;
        int qtdePares = 0;
        int qtdeImpares = 0;
        
        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();
        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();
        
        if (numi > numf) {
            int num = numf;
            numf = numi;
            numi = num;
        }
        
        for (int i = numi; i < numf + 1; i++) {
            qtde++;
            soma = soma + i;
            if ((i % 2) == 0) {
                qtdePares++;
            } else {
                qtdeImpares++;
            }
        }
        
        // Fechando o objeto Scanner
        sc.close();
        
        System.out.println("Informação sobre o intervalo: " + informacaoIntervalo(numi, numf));

        System.out.println("\n\nSoma: " + (numf + numi) + "\nMédia: " + soma / qtde + "\nQtde Pares: " + qtdePares + "\nQtde Ímpares: " + qtdeImpares);
        
        System.out.println("Quantidade de números no intervalo: " + qtde);
        System.out.println("Soma dos primeiros números a partir do inicial: " + soma);
        System.out.println("Diferença entre o número final e o inicial: " + (numf - numi));
        
    }
    
    // Método para retornar a informação sobre o dado intervalo
    public static String informacaoIntervalo(int numi, int numf){
        return "Intervalo entre " + numi + " e " + numf;
    }
}

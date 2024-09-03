import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int numi = 0, numf = 0;
        int soma = 0;
        double media;
        int qtde = 0;
        int qtdePares = 0;
        int qtdeImpares = 0;
        int somaNumIntervalos = 0;
        
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

        System.out.println("Soma: " + soma + "\nMédia: " + soma / qtde + "\nQtde Pares: " + qtdePares + "\nQtde Ímpares: " + qtdeImpares + "\nQtde números no intervalo: " + (numf - numi));

        sc.close();

    }
}

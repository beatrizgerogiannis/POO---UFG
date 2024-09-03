import entities.Intervalo;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int numi = 0, numf = 0;
        
        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();
        
        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();
        
        Intervalo num = new Intervalo(numi, numf);
        System.out.println("\n\nInformação sobre o intervalo: " + num.informacaoIntervalo());
        
        System.out.println("\nSoma : " + num.soma() + "\nMédia : " + num.media() + "\nQtde Pares : " + num.qtdePares() + "\nQtde Ímpares : " + num.qtdeImpares());
        sc.close();

        System.out.println("Quantidade de numeros no intervalo: " + num.contarNumerosNoIntervalo());
        System.out.println("Soma dos primeiros numeros a partir do inical: " + num.somaDosPrimeirosN());
        System.out.println("Diferença entre o numero final e o inicial: " + num.diferencaEntreNumeros());
    }
}

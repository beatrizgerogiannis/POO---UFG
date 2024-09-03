package entities;

public class Intervalo {
    int numi;
    int numf;
    
    public Intervalo(int numi, int numf) {
        if (numi < numf) {
            this.numi = numi;
            this.numf = numf;
        } else {
            this.numi = numf;
            this.numf = numi;
        }
    }
    
    public double soma() {
        return (numf + numi);
    }
    
    public double media() {
        return soma() / (numf - numi + 1);
    }
    
    public int qtdePares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) == 0)
                qtde++;
        }
        return qtde;
    }
    
    public int qtdeImpares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) > 0)
                qtde++;
        }
        return qtde;
    }

    // Método para retornar a quantidade de números no intervalo
    public int contarNumerosNoIntervalo(){
        int qtde = 0;
        for(int i = numi; i < numf + 1; i++){
            qtde++;
        }
        return qtde;
    }

    // Método para retornar a soma dos n primeiros números a partir do inicial
    public int somaDosPrimeirosN(){
        int soma = 0;
        for(int i = numi; i <= numf; i++){
            soma += i;
        }
        return soma;
    }

    // Método para retornar a diferença entre o número final e o inicial
    public int diferencaEntreNumeros(){
        int diferença = numf - numi;

        return diferença;
    }

    // Método para retornar a informação sobre o dado intervalo
    public String informacaoIntervalo(){
        return "Intervalo entre " + numi + " e " + numf;
    }
}

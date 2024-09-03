package entities;

import java.util.ArrayList;
import java.util.List;

public class Apartamento{
    private String numero;
    private int andar;
    private double metragem;
    private String situacao;
    private List<Morador> moradores;

    public Apartamento(String numero, int andar, double metragem, String situacao){
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

     // Métodos de acesso aos atributos
     public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    // Método para adicionar um morador ao apartamento
    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }

    // Método para remover um morador do apartamento
    public void removerMorador(Morador morador) {
        moradores.remove(morador);
    }

    // Método toString para exibir informações do apartamento
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------------------------------------\n");
        builder.append("Apartamento: ").append(numero).append("\n")
            .append("Andar: ").append(andar).append("\n")
            .append("Metragem: ").append(metragem).append("\n")
            .append("Situação: ").append(situacao).append("\n");
        
        for (Morador morador : moradores) {
            builder.append("\nNome: ").append(morador.getNome())
                .append("\nCPF: ").append(morador.getCpf())
                .append("\nCelular: ").append(morador.getCelular())
                .append("\nData de Nascimento: ").append(morador.getDataNascimento())
                .append("\nSexo: ").append(morador.getSexo())
                .append("\nBloco: ").append(morador.getBloco())
                .append("\nApartamento: ").append(morador.getApartamento())
                .append("\nCódigo de Acesso: ").append(morador.getCodigoAcesso())
                .append("\nCódigo Sequencial: ").append(morador.getCodigoSequencial())
                .append("\n------------------------------------\n");
        }
        return builder.toString();
    }
}
package entities;

import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas;
    private int qtdAtual;

    public CadastroPessoas(){
        pessoas = new ArrayList<>();
        qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pess){
        pessoas.add(pess);
        qtdAtual++;
    }

    public void imprimeCadastro(){
        for(Pessoa p : pessoas){
            p.imprimeDados();
            System.out.println();
        }
    }
}

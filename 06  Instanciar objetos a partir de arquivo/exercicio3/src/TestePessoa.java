import entities.Funcionario;
import entities.Pessoa;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestePessoa {
    @Test
    public void testIdade65OuMais() {
        Pessoa pessoa = new Pessoa("João", 2500.00, 2, 70);
        assertEquals(0, pessoa.calculaImposto(), 0);
    }

    @Test
    public void testPrimeiraFaixa() {
        Pessoa pessoa = new Pessoa("Maria", 1500.00, 1, 40);
        assertEquals(0, pessoa.calculaImposto(), 0);
    }

    @Test
    public void testSegundaFaixa() {
        Pessoa pessoa = new Pessoa("José", 2000.00, 2, 50);
        assertEquals(15.91, pessoa.calculaImposto(), 0.1);
    }

    @Test
    public void testTerceiraFaixa() {
        Pessoa pessoa = new Pessoa("Paulo", 3500.00, 0, 30);
        assertEquals(189.97, pessoa.calculaImposto(), 0.1);
    }

    @Test
    public void testQuartaFaixa() {
        Pessoa pessoa = new Pessoa("Ana", 4400.00, 3, 45);
        assertEquals(27.62, pessoa.calculaImposto(), 0.1);
    }

    @Test
    public void testQuintaFaixa() {
        Pessoa pessoa = new Pessoa("Carlos", 7000.00, 6, 55);
        assertEquals(20.59, pessoa.calculaImposto(), 0.1);
    }
}

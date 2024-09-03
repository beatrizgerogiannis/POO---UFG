import entities.CadastroPessoas;
import entities.Cliente;
import entities.Data;
import entities.Funcionario;
import entities.Gerente;


public class App {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        Data data1 = new Data(1, 1, 1980);
        Data data2 = new Data(2, 2, 1990);
        Data data3 = new Data(3, 3, 2000);

        Cliente cliente = new Cliente("Cliente1", data1, 123);
        Funcionario funcionario = new Funcionario("Funcionario1", data2, 5555f);
        Gerente gerente = new Gerente ("Gerente1", data3, 3333f, "TI");

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);


        cadastro.imprimeCadastro();
    }
}

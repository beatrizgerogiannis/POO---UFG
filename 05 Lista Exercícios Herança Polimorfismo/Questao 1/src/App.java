
public class App {
    public static void main(String[] args){
    
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new Horista("João", "Silva", 120, 10.0);
        funcionarios[1] = new Horista("Maria",  "Santos", 140, 12.0);
        funcionarios[2] = new Administrador("José",  "Souza", 5000);
        funcionarios[3] = new Administrador("Ana",  "Ferreira", 6000);
        funcionarios[4] = new Administrador("Carlos",  "Oliveira", 4500);
        funcionarios[5] = new Administrador("Amanda",  "Costa", 5500);
        funcionarios[6] = new Comissionado("Pedro",  "Rodrigues", 3000, 20000, 0.05);
        funcionarios[7] = new Comissionado("Mariana", "Almeida", 3500, 25000, 0.06);
        funcionarios[8] = new Comissionado("Paulo", "Cunha", 3200, 18000, 0.04);
        funcionarios[9] = new Gerente("Laura", "Lima", 7000, 2000);
    
        for(Funcionario funcionario : funcionarios){
            System.out.println("Dados do funcionario:");
            funcionario.mostrarDados();
            System.out.println("Ganhos mensais: " + funcionario.calcularGanhosMensais());
            System.out.println();
        }
    
    }

    public static class Funcionario {
        private String nome;
        private String sobrenome;
    
        public Funcionario(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getSobrenome() {
            return sobrenome;
        }
    
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
    
        public void mostrarDados() {
            System.out.println("Nome: " + nome + " " + sobrenome);
        }
    
        public double calcularGanhosMensais() {
            return 0.0;
        }
    }
    
    public static class Administrador extends Funcionario{
        private double salarioMensal;
    
        public Administrador(String nome, String sobrenome, double salarioMensal){
            super(nome, sobrenome);
            this.salarioMensal = salarioMensal;
        }
        
        @Override
        public double calcularGanhosMensais(){
            return salarioMensal;
        }
    }
    
    public static class Gerente extends Funcionario{
        private double salarioMensal;
        private double bonificacao;
    
        public Gerente(String nome, String sobrenome, double salarioMensal, double bonificacao){
            super(nome, sobrenome);
            this.salarioMensal = salarioMensal;
            this.bonificacao = bonificacao;
        }
    
        @Override
        public double calcularGanhosMensais(){
            return salarioMensal + bonificacao;
        }
    }
    
    public static class Comissionado extends Funcionario{
        private double salarioMensal;
        private double totalVendas;
        private double percentualComissao;
    
        public Comissionado(String nome, String sobrenome, double salarioMensal, double totalVendas, double percentualComissao){
            super(nome , sobrenome);
            this.salarioMensal = salarioMensal;
            this.totalVendas = totalVendas;
            this.percentualComissao = percentualComissao;
        }
    
        @Override
        public double calcularGanhosMensais(){
            return salarioMensal + (totalVendas * percentualComissao);
        }
    }
    
    public static class Horista extends Funcionario{
        private double horasTrabalhadas;
        private double valorHora;
    
        public Horista(String nome, String sobrenome, double horasTrabalhadas, double valorHora){
            super(nome, sobrenome);
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHora = valorHora;
        }
    
        @Override
        public double calcularGanhosMensais(){
            return horasTrabalhadas * valorHora;
        }
    }
}

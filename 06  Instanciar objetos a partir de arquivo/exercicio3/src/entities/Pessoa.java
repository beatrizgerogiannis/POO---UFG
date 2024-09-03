package entities;

public class Pessoa extends Funcionario {
    private int idade;

    public Pessoa(String nome, double salario, int dependentes, int idade) {
        super(nome, 'M', salario, dependentes); // Por padrão, definimos o sexo como masculino
        this.idade = idade;
    }

    @Override
    public double calculaImposto() {
        // Se a pessoa tem 65 anos ou mais, não paga imposto
        if (idade >= 65) {
            return 0;
        }

        // Cálculo do imposto conforme as faixas de salário
        if (salario <= 1787.77) {
            return 0;
        } else if (salario <= 2679.29) {
            return salario * 0.075 - 134.08;
        } else if (salario <= 3572.43) {
            return salario * 0.15 - 335.03;
        } else if (salario <= 4463.81) {
            return salario * 0.225 - 602.96;
        } else {
            return salario * 0.275 - 826.15;
        }
    }
}

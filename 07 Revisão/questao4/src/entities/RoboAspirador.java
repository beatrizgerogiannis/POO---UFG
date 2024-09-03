package entities;

public class RoboAspirador{

    int id;
    String status;
    double posicaoX;
    double posicaoY;
    double qtdPo;
    double limitePo;

    public RoboAspirador(int id, double limitePo){
        this.id = id;
        this.status = "DESLIGADO";
        this.posicaoX = 0.0;
        this.posicaoY = 0.0;
        this.qtdPo = 0;
        this.limitePo = limitePo;
    }

    //Métodos de operação do robô.
    public void ligar(){
        if(status.equals("DESLIGADO")){
            status = "LIGADO";
            System.out.println("\nO robo agora esta LIGADO.");
        }else
            System.out.println("\nO robo ja esta LIGADO.");
    }

    public void desligar(){
        if(status != "DESLIGADO"){
            status = "DESLIGADO";
            System.out.println("\nO robo agora esta DESLIGADO.");
        }else
            System.out.println("\nO robo ja esta DESLIGADO.");
    }

    public void aspirar(int qtdParaAspirar){
        if(status.equals("LIGADO") || status.equals("ANDANDO") || status.equals("LIGADO") || status.equals("PARADO")){
            qtdPo += qtdParaAspirar;

            if(qtdPo > limitePo){
                desligar();
                System.out.println("\nLimite de po atingido. O robo foi DESLIGADO."); 
            }else{
                System.out.println("\nAspirando...");
            }
        }else{
            System.out.println("\nO robo precisa ser LIGADO antes de aspirar.");
        }
    }

    public void andar(int valorX, int valorY){
        if(status.equals("LIGADO") || status.equals("PARADO")){
        
            posicaoX += valorX;
            posicaoY += valorY;
            status = "ANDANDO";

            System.out.println("\nO robo agora esta ANDANDO.");


        }else{
            System.out.println("\nO robo precisa ser LIGADO antes de aspirar.");
        }
    }

    public void parar(){
        if(status.equals("LIGADO") || status.equals("ANDANDO")){
            status = "PARADO.";
            System.out.println("\nAgora o robo esta parado.");
        }else if(status.equals("DESLIGADO")){
            System.out.println("\nO robo precisa primeiramente estar LIGADO");
        }else{
            System.out.println("\nO robo ja esta PARADO.");
        }
    }

    public String toString() {
        return "\n--------------------------\n\nRobô " + id + ":" + "\nStatus = " + status + "\nPosição = (" + posicaoX + ", " + posicaoY + ")" + "\nQuantidade de Po = " + qtdPo + "\n--------------------------\n";
    }
}
package Criacao.Abstract_Method;

public class ConcretePassagemOnibusInterestadual extends PassagemOnibusInterestadual {

    public ConcretePassagemOnibusInterestadual(String origem, String destino, String dataHoraDaPartida) {
        super(origem, destino, dataHoraDaPartida);
    }

    @Override
    public void detalhes() {
        System.out.println("Passagem de Onibus Interestadual: \n "+this.getOrigem() +" até "+ this.getDestino()+" ás "+this.getDataHoraDaPartida());

    }
}

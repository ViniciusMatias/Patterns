package Criacao.Abstract_Method;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbana {

    public ConcretePassagemOnibusUrbano(String origem, String destino, String dataHoraDaPartida) {
        super(origem, destino, dataHoraDaPartida);
    }

    @Override
    public void detalhes() {
        System.out.println("Passagem de Onibus Urbana: \n"+this.getOrigem() +" Para "+ this.getDestino()+ " ás "+this.getDataHoraDaPartida());
    }
}

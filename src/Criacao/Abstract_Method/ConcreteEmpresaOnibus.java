package Criacao.Abstract_Method;

public class ConcreteEmpresaOnibus extends EmpresaOnibus{


    public PassagemOnibusUrbana emitirPassagemOnibusUrbano(String origem,String destino, String dataHora) {
        return new ConcretePassagemOnibusUrbano(origem,destino,dataHora);
    }


    public PassagemOnibusInterestadual emitirPassagemOnibusInterestadual(String origem,String destino, String dataHora) {
        return  new ConcretePassagemOnibusInterestadual(origem,destino,dataHora);
    }
}

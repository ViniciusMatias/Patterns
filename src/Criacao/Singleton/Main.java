package Criacao.Singleton;

public class Main {

    public static void main(String[] args) {

        //Janela 01
        Janela j = Janela.getInstace();
        j.pack();
        j.setVisible(true);


        //Janela 02
        Janela j2 = Janela.getInstace();
        j2.pack();
        j2.setVisible(true);

        System.out.println(j == j2 );


    }


}

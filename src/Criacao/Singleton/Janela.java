package Criacao.Singleton;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {


    private static final Janela INSTANCE = new Janela();

    private Janela(){
        setPreferredSize(new Dimension(640,480));
    }

    public static Janela getInstace(){
       return INSTANCE;
    }

    }


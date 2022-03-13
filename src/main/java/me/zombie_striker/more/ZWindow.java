package me.zombie_striker.more;

import javax.swing.*;
import java.awt.*;

public class ZWindow extends Canvas implements Runnable {

    private JFrame window;
    private Thread thread;


    public ZWindow(String name){
        window = new JFrame(name);
        window.setSize(1000,1000);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void run() {

    }
}

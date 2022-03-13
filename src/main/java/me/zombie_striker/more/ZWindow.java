package me.zombie_striker.more;

import javax.swing.*;
import java.awt.*;

public class ZWindow extends Canvas implements Runnable {

    private JFrame window;
    private Thread thread;
    private JPanel panel;

    public ZWindow(String name, int locX, int locY, int width, int height){
        window = new JFrame(name);
        panel = new JPanel();
        window.setSize(width,height);
        window.setLocation(locX,locY);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void run() {

    }
}

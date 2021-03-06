package me.zombie_striker.more.window;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ZWindow extends Canvas implements Runnable {

    private JFrame window;
    private Thread thread;
    private boolean running = true;
    private Renderable render;
    private Tickable tick;
    private Interactable interactable;

    public ZWindow(String name, int locX, int locY, int width, int height, Renderable render, Tickable tick, Interactable interactable){
        window = new JFrame(name);
        window.setSize(width,height);
        window.setLocation(locX,locY);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.add(this);
        thread = new Thread(this);

        this.addKeyListener(interactable);
        this.addMouseListener(interactable);
        window.addKeyListener(interactable);
        window.addMouseListener(interactable);

        this.render = render;
        this.tick = tick;

        window.setVisible(true);
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            long time = System.currentTimeMillis();
            tick.tick();
            BufferedImage frame = render.render(window.getWidth(),window.getHeight());
            Graphics2D g = (Graphics2D) this.getGraphics();
            g.drawImage(frame,0,0,frame.getWidth(),frame.getHeight(),null);
            g.dispose();
            long dtime = System.currentTimeMillis()-time;
            if(100/6 - dtime > 0){
                try {
                    Thread.sleep(100/6 - dtime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

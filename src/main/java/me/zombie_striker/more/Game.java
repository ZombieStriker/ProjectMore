package me.zombie_striker.more;

import me.zombie_striker.more.game.submenu.SubMenu;
import me.zombie_striker.more.game.submenu.SubMenuGen;
import me.zombie_striker.more.gamestates.GameState;
import me.zombie_striker.more.gamestates.InGameState;
import me.zombie_striker.more.window.Interactable;
import me.zombie_striker.more.window.Renderable;
import me.zombie_striker.more.window.Tickable;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

public class Game implements Tickable, Renderable, Interactable {

    private GameState currentState;

    private List<SubMenu> submenues = new LinkedList<>();

    public Game(){
        currentState = new InGameState();
        submenues.add(SubMenuGen.genToolbar());
    }

    public BufferedImage render(int xsize, int ysize){
        BufferedImage bi = currentState.render(xsize, ysize);
        Graphics2D g = (Graphics2D) bi.getGraphics();
        for(SubMenu menu : submenues){
            menu.render(g);
        }
        g.dispose();
        return bi;
    }

    @Override
    public void tick() {
        currentState.tick();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
            for(SubMenu men : submenues){
                if(men.getAbsX() < e.getX() && men.getAbsX()+ men.getWidth() > e.getX() && men.getAbsY() < e.getY() && men.getAbsY()+men.getHeight() > e.getY())
                    men.buttonPress(e);
            }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

package me.zombie_striker.more.gamestates;

import me.zombie_striker.more.game.GameObject;
import me.zombie_striker.more.game.Universe;

import java.awt.*;
import java.awt.image.BufferedImage;

public class InGameState extends GameState{

    private Universe universe;

    public InGameState(){
        universe = new Universe();
    }

    @Override
    public BufferedImage render(int xsize, int ysize) {
        BufferedImage bi = new BufferedImage(xsize,ysize,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bi.getGraphics();
        for(GameObject gol : universe.getObjects()){
            //TODO: Draw image at gol location
        }
        g.dispose();
        return bi;
    }
}

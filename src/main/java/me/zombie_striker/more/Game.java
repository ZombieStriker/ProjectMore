package me.zombie_striker.more;

import me.zombie_striker.more.gamestates.GameState;
import me.zombie_striker.more.gamestates.InGameState;
import me.zombie_striker.more.window.Renderable;
import me.zombie_striker.more.window.Tickable;

import java.awt.image.BufferedImage;

public class Game implements Tickable, Renderable {

    private GameState currentState;

    public Game(){
        currentState = new InGameState();
    }

    public BufferedImage render(int xsize, int ysize){
        return currentState.render(xsize, ysize);
    }

    @Override
    public void tick() {
        currentState.tick();
    }
}

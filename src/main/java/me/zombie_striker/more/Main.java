package me.zombie_striker.more;

import me.zombie_striker.more.window.ZWindow;

public class Main {

    private static Game gameinstance = new Game();

    public static void main(String... args){
        ZWindow window = new ZWindow("More",0,0,1000,1000, gameinstance, gameinstance, gameinstance);
    }
}

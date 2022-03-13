package me.zombie_striker.more.game;

import java.util.LinkedList;
import java.util.List;

public class Universe {

    private List<GameObject> objects = new LinkedList<>();

    public void tick(){
        for(GameObject obj : objects){
            obj.tick();
        }
    }

    public List<GameObject> getObjects() {
        return objects;
    }
}


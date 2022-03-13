package me.zombie_striker.more.game;

import java.util.LinkedList;
import java.util.List;

public class Universe {

    private List<GameObject> objects = new LinkedList<>();

    public Universe(){
        objects.add(new NPC(500,500));
    }

    public void tick(){
        for(GameObject obj : objects){
            obj.tick();
        }
    }

    public List<GameObject> getObjects() {
        return objects;
    }
}


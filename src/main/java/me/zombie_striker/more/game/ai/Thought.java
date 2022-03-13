package me.zombie_striker.more.game.ai;

public class Thought {

    private ThoughtType type;
    private int strength;

    public Thought(ThoughtType type, int strength){
        this.type = type;
        this.strength = strength;
    }

    public ThoughtType getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }
}

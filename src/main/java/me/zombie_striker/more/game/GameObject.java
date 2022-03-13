package me.zombie_striker.more.game;

public abstract class GameObject {

    private int x;
    private int z;

    public GameObject(int x , int z){
        this.x =x;
        this.z =z;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public abstract void tick();
}

package me.zombie_striker.more.game;

import me.zombie_striker.more.game.ai.NPCAI;

public class NPC extends GameObject {

    private NPCAI ai;

    public NPC(int x, int z) {
        super(x, z);
        ai = new NPCAI();
    }

    @Override
    public void tick() {
        ai.tick(this);
    }
}

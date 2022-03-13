package me.zombie_striker.more.game.ai.goal;

import me.zombie_striker.more.game.NPC;
import me.zombie_striker.more.game.ai.NPCAI;

public abstract class AbstractGoal {

    public abstract boolean tick(NPCAI ai, NPC npc);
}

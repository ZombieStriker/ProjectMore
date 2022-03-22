package me.zombie_striker.more.game.ai.scripter;

import me.zombie_striker.more.game.NPC;
import me.zombie_striker.more.game.ai.NPCAI;

public abstract class ScriptEffect {

    public abstract void call(ScriptStatement statement, NPC npc, NPCAI npcai);
}

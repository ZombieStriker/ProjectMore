package me.zombie_striker.more.game.ai.scripter;

import me.zombie_striker.more.game.NPC;
import me.zombie_striker.more.game.ai.NPCAI;

import java.util.LinkedList;
import java.util.List;

public class Script {

    private List<ScriptStatement> statements = new LinkedList<>();

    public Script(){

    }

    public List<ScriptStatement> getStatements() {
        return statements;
    }

    public void tick(NPC npc, NPCAI npcai) {
    }
}

package me.zombie_striker.more.game.ai;

import me.zombie_striker.more.game.GameObject;
import me.zombie_striker.more.game.NPC;
import me.zombie_striker.more.game.ai.goal.AbstractGoal;
import me.zombie_striker.more.game.ai.scripter.Script;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NPCAI {

    private HashMap<GameObject, List<Thought>> thoughts = new HashMap<>();

    private List<AbstractGoal> goals = new LinkedList<>();

    private Script script;

    public void setScript(Script script) {
        this.script = script;
    }

    public Script getScript() {
        return script;
    }

    public void tick(NPC npc) {
        script.tick(npc,this);
        for (AbstractGoal goal : new LinkedList<>(goals)) {
            if (goal.tick(this, npc))
                goals.remove(goal);
        }
    }

    public void addGoal(AbstractGoal goal) {
        this.goals.add(goal);
    }
}

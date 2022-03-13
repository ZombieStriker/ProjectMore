package me.zombie_striker.more.game.ai;

import me.zombie_striker.more.game.GameObject;
import me.zombie_striker.more.game.NPC;
import me.zombie_striker.more.game.ai.goal.AbstractGoal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NPCAI {

    private HashMap<GameObject, List<Thought>> thoughts = new HashMap<>();

    private List<AbstractGoal> goals = new LinkedList<>();

    public void tick(NPC npc) {
        for (AbstractGoal goal : new LinkedList<>(goals)) {
            if (goal.tick(this, npc))
                goals.remove(goal);
        }
    }

    public void addGoal(AbstractGoal goal) {
        this.goals.add(goal);
    }
}

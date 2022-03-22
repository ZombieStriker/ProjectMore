package me.zombie_striker.more.game.ai.scripter;

public class ScriptStatement {

    private ScriptInitiatorEnum start;
    private ScriptTargetEnum target;
    private ScriptEffect effect;

    public ScriptStatement(){

    }

    public void setEffect(ScriptEffect effect) {
        this.effect = effect;
    }

    public void setStart(ScriptInitiatorEnum start) {
        this.start = start;
    }

    public void setTarget(ScriptTargetEnum target) {
        this.target = target;
    }

    public ScriptEffect getEffect() {
        return effect;
    }

    public ScriptInitiatorEnum getStart() {
        return start;
    }

    public ScriptTargetEnum getTarget() {
        return target;
    }
}

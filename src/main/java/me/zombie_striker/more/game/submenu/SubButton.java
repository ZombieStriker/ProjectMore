package me.zombie_striker.more.game.submenu;

import java.awt.event.MouseEvent;

public abstract class SubButton extends SubElement{

    public SubButton(SubMenu menu, int x, int y, int width, int height) {
        super(menu, x, y, width, height);
    }

    @Override
    public void buttonPress(MouseEvent e) {
        super.buttonPress(e);
        onPress();
    }

    public abstract void onPress();
}

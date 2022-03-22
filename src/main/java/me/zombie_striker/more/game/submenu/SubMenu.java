package me.zombie_striker.more.game.submenu;

import java.util.LinkedList;
import java.util.List;

public class SubMenu extends SubElement{

    public SubMenu(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public SubMenu(SubMenu menu, int x, int y, int width, int height) {
        super(menu, x, y, width, height);
    }

}

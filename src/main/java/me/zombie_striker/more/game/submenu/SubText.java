package me.zombie_striker.more.game.submenu;

import java.awt.*;

public class SubText extends SubElement{

    private String string;

    public SubText(SubElement element,String text, int x, int y, int width, int height){
        super(element,x,y,width,height);
        this.string = text;
    }

    public String getString() {
        return string;
    }

    @Override
    public void render(Graphics2D screen) {
        int fontsize = 12;
        screen.setColor(new Color(255,255,255));
        screen.setFont(new Font("TimesRoman", Font.PLAIN, fontsize));
        screen.drawString(string,getMaster().getAbsX()+ getX(), getMaster().getAbsY()+getY());
    }
}

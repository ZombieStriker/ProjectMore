package me.zombie_striker.more.game.submenu;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

public class SubElement {

    private int x;
    private int y;
    private int width;
    private int height;
    private SubElement master;
    private SubDisplayType displaytype;

    private List<SubElement> elements = new LinkedList<>();

    public SubElement(int x ,int y , int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.displaytype = SubDisplayType.BOARDERBUTTON;
    }
    public SubElement(SubElement master, int x ,int y , int width, int height){
        this.master = master;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.master.addElement(this);
        this.displaytype = SubDisplayType.BOARDERBUTTON;
    }

    public void render(Graphics2D screen){
        if(master!=null){
            screen.setColor(new Color(166, 166, 187));
            screen.fillRect(master.getX()+x, master.getY()+y, width, height);
            screen.setColor(new Color(126, 126, 163));
            screen.fillRect(master.getX()+x + 1, master.getY()+y + 1, width - 1, height - 1);
        }else {
            screen.setColor(new Color(200, 200, 220));
            screen.fillRect(x, y, width, height);
            screen.setColor(new Color(150, 150, 190));
            screen.fillRect(x + 1, y + 1, width - 1, height - 1);
        }

        for(SubElement subs : elements){
            subs.render(screen);
        }
    }

    public SubElement getMaster() {
        return master;
    }

    public void addElement(SubElement element){
        this.elements.add(element);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAbsX(){
        if(master==null)
            return x;
        return master.getAbsX()+x;
    }
    public int getAbsY(){
        if(master==null)
            return y;
        return master.getAbsY()+y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void buttonPress(MouseEvent e) {
        for(SubElement men : elements){
            if(men.getAbsX() < e.getX() && men.getAbsX()+ men.getWidth() > e.getX() && men.getAbsY() < e.getY() && men.getAbsY()+men.getHeight() > e.getY())
                men.buttonPress(e);
        }
    }
}

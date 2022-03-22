package me.zombie_striker.more.game.submenu;

public class SubMenuGen {

    public static SubMenu genToolbar(){
        SubMenu tool = new SubMenu(0,900,1000,100);
        SubButton button1 = new SubButton(tool,0,0,100,100) {
            @Override
            public void onPress() {
                System.out.println("Button test");
            }
        };
        new SubText(button1,"TestButton",5,40,90,20);
        return tool;
    }
}

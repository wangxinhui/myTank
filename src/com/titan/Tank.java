package com.titan;

import java.awt.*;

public class Tank {
    private int x ;
    private int y ;
    private Dir dir;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        switch (dir){
            case UP:
                y -= 10;
                break;
            case DOWN:
                y += 10;
                break;
            case LEFT:
                x -= 10;
                break;
            case RIGHT:
                x +=10;
                break;
            default:
                break;
        }
    }
}

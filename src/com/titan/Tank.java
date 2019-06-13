package com.titan;

import java.awt.*;

public class Tank {
    private int x;
    private int y;
    private Dir dir;
    private TankFrame tf;
    private final int SPEED = 5;

    public Tank(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
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
        switch (dir) {
            case UP:
                g.drawImage(ResourceMgr.tankU,x, y, null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.tankD,x, y, null);
                break;
            case LEFT:
                g.drawImage(ResourceMgr.tankL,x, y, null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.tankR,x, y, null);
                break;
            default:
                break;
        }
    }

    public void moving(boolean b) {
        if (!b) return;
        switch (dir) {
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            default:
                break;
        }
    }

    public void fire() {
        tf.bulletList.add(new Bullet(this.x, this.y, this.dir,this.tf));
    }
}

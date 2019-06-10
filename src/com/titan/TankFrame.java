package com.titan;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class TankFrame extends Frame {

    Tank t = new Tank(200,200,Dir.DOWN,this);
    List<Bullet> bulletList = new ArrayList<>();
//    Bullet bullet = new Bullet(200,200,Dir.DOWN);
    static final  int WIDTH = 800;
    static final  int HEIGHT = 800;


    public TankFrame() {
        setBackground(Color.CYAN);
        setTitle("Titan");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addKeyListener(new MyKeyListener());
    }

    Image offScreenImage = null;
    @Override
    public void update(Graphics g) {
        if (offScreenImage == null ){
            offScreenImage =this.createImage(WIDTH,HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c =  gOffScreen.getColor();
        gOffScreen.setColor(Color.GRAY);
        gOffScreen.fillRect(0,0,WIDTH,HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null);

    }

    @Override
    public void paint(Graphics g) {
        t.paint(g);
        for (int i = 0; i < bulletList.size(); i++) {
            bulletList.get(i).paint(g);
        }
    }

    class MyKeyListener extends KeyAdapter{
        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT :
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT :
                    bR = true;
                    break;
                case KeyEvent.VK_UP :
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN :
                    bD = true;
                    break;
                    default:
                        break;
            }
            setTankMove();
        }

        private void setTankMove() {
            if (!bL &&!bR && !bU &&  !bD) {
                t.moving(false);
            }else {
                if (bL) t.setDir(Dir.LEFT);
                if (bR) t.setDir(Dir.RIGHT);
                if (bU) t.setDir(Dir.UP);
                if (bD) t.setDir(Dir.DOWN);
                t.moving(true);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT :
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT :
                    bR = false;
                    break;
                case KeyEvent.VK_UP :
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN :
                    bD = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    t.fire();
                default:
                    break;
            }
            setTankMove();
        }
    }

}

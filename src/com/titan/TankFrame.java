package com.titan;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    Tank t = new Tank(200,200,Dir.DOWN);

    public TankFrame() {
        setBackground(Color.CYAN);
        setTitle("Titan");
        setSize(800, 600);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addKeyListener(new MyKeyListener());
    }

    @Override
    public void paint(Graphics g) {
        t.paint(g);
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
                default:
                    break;
            }
            setTankMove();
        }
    }

}

package com.titan;

public class TankTest {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true){
            Thread.sleep(10);
            tankFrame.repaint();
        }
    }
}

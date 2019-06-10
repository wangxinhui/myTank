package com.titan;

import java.util.ArrayList;
import java.util.List;

public class TankTest {
    public static void main(String[] args) throws InterruptedException {
//        TankFrame tankFrame = new TankFrame();
//        while (true){
//            Thread.sleep(50);
//            tankFrame.repaint();
//        }
        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
            l.remove("2");
        }
    }
}

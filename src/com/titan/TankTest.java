package com.titan;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TankTest {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true){
            Thread.sleep(50);
            tankFrame.repaint();
        }


//        BufferedWriter out = null;
//        String path = "D:\\test\\285343.txt";
//        try (FileReader fileReader = new FileReader(path);
//             BufferedReader reader = new BufferedReader(fileReader);) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (!"".equals(line.trim())) {
//                    int code = line.hashCode() % 1000;
//                    String fileName = String.valueOf(code);
//                    String blockFilePath = "D:\\test\\" + code + ".txt";
//                    File file = new File(blockFilePath);
//                    if (!file.exists()) {
//                        file.createNewFile();
//                    }
//                    out = new BufferedWriter(new OutputStreamWriter(
//                            new FileOutputStream(file, true)));
//                    out.write(line + "\r\n");
//                    out.flush();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        String searchChar = " 　　少女走近了，张小凡这才看清，在她右手葱葱玉指上，夹著一朵白色的小花，竟会散发出淡淡白光，照亮了这女子附近的土地，也不知道这是什麽异种。 ";
//        int code = searchChar.hashCode() % 1000;
//        String fileName = String.valueOf(code);
//        String blockFilePath = "D:\\test\\" + code + ".txt";
//        File file = new File(blockFilePath);
//        if (!file.exists()) {
//            System.out.println("数据不存在");
//        }
//        try (FileReader fileReader = new FileReader(blockFilePath);
//             BufferedReader reader = new BufferedReader(fileReader);) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (searchChar.equals(line)){
//                    System.out.println(code);
//                    System.out.println("数据存在");
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        List<String> l = new ArrayList<>();
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//            l.remove("2");
//        }
//        for (String s : l){
//            l.remove("2");
//            System.out.println(s);
//        }
    }
}

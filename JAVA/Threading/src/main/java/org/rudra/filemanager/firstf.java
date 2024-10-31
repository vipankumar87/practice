package org.rudra.filemanager;

import java.io.*;

public class firstf {
    public static void main(String[] ar) throws IOException {
        File file = new File("rudracomputer//info.text");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            BufferedReader br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

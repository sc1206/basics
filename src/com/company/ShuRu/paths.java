package com.company.ShuRu;

import java.io.File;
import java.io.IOException;

public class paths {

    public static void main(String[] args) throws IOException {
        File f = new File("D:\\");
        listDir(f.getCanonicalFile(), 0);

    }

    static void listDir(File dir, int indent) {
        File[] fs = dir.listFiles();
        if (fs != null) {
            for (File f : fs) {
                for (int i = 0; i < indent; i++) {
                    System.out.println("  ");
                }
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                } else {
                    System.out.println(f.getName());
                }
                listDir(f, indent + 1);
            }
        }

    }


}

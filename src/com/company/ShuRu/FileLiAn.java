package com.company.ShuRu;

import java.io.*;
import java.util.Scanner;

public class FileLiAn {
    public static void main(String[] args) throws IOException {
        FileLiAn fl = new FileLiAn();
        fl.inputFiles();
    }

    public void inputFiles() throws IOException {
        System.out.println("请输入需要查询的专业");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        File f = new File(path);
        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println("请输入您想查询目录的文件类型");
                String data = sc.next();
                File[] fs1 = f.listFiles();
//            printFile(fs1);
                File[] fs2 = f.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(data);
                    }
                });
                printFile(fs2);
                System.out.println("这个时候f是" + f);
            } else {
                System.out.println("你这个文件夹不存在");
            }
        } else {
            System.out.println("您输入的文件目录不存在是否需要创建目录！1：创建,2:不创建");
            int wr = sc.nextInt();
            if (wr == 1) {
                if (f.mkdir()) {
                    System.out.println("目录已经创建,是否想继续创建文件,1:创建。2：不创建");
                    int wrs = sc.nextInt();
                    if (wrs == 1) {
                        f.createNewFile();
                        System.out.println("请输入数据");
                        try (OutputStream outputStream = new FileOutputStream(f)) {
                            String wri = sc.next();
                            outputStream.write(wri.getBytes("UTF-8"));
                        }
                    } else if (wrs == 2) {
                        System.out.println();
                    }
                }
            } else if (wr == 2) {
                InputStream inputStream = new FileInputStream(f);
                int n;
                if (inputStream != null) {
                    while ((n = inputStream.read()) != -1) {
                        System.out.println("" + (char) n);
                    }
                }
            }
        }
    }

    static void printFile(File[] files) {
        System.out.println("-----------------");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("=================");
    }
}
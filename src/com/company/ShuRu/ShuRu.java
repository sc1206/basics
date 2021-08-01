package com.company.ShuRu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ShuRu {
    public static void main(String[] args) throws Exception {
     /*   File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);*/
//        File f1 = new File("C:\\window");
//        File f2 = new File("C:\\window\\notepad.exe");
//        File f3 = new File("C:\\window\\nothing");
//        使用isFile可以判断这个文件是否存在
//        System.out.println(f1.isFile());
//        使用isDirectory可以判断这个对象是否是一个已经存在的目录
//        System.out.println(f1.canRead());
//        System.out.println(f2.isFile());
//        System.out.println(f2.isDirectory());
//        System.out.println(f3.isFile());
//        System.out.println(f3.isDirectory());

//        boolean canRead  判断这个文件是否可读
//        boolean canWrite 判断这个文件是否可写
//        boolean canExecute 判断这个文件是否可执行
//        long length判断这个文件的字节长度
/*
        File f5 = new File("D:\\files");
        if (f5.createNewFile()) {
            System.out.println("文件创建成功");
            if (f5.delete()) {
                System.out.println("文件删除成功");
            }
        }

        File f6 = File.createTempFile("tmp-", ".txt");
        f6.deleteOnExit();
        System.out.println(f6.isFile());
        System.out.println(f6.getAbsolutePath());*/

    }

    static void allFile(File [] file2){
        System.out.println("请输入查询的路径");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        File f = new File(path);
        File[] fs1 = f.listFiles();
        printFile(fs1);
        File[] fs2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        printFile(fs2);
    }

    static void printFile(File[] files) {
        System.out.println("==================小分界线==================");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
            System.out.println("===============大分界线====================");
        }else {
            System.out.println("未查询到此路径是否创建,1创建，2不创建");

        }
    }


}
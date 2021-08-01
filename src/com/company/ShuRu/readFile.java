package com.company.ShuRu;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class readFile {
    public void readFile() throws IOException {

        //        使用try(resource)可以自动关闭资源，Java7以后才有
        try (InputStream input = new FileInputStream("D:\\iotest\\1.txt")) {
//            声明一个变量
            int n;
//            利用while循环判断一下读取的文件是否读取到了最后一个字节
            while ((n = input.read()) != -1) {
//                将字节的长度打印出来
                System.out.println("字节长度为" + n);
            }
        }


    }

    public void readFileTwo() throws IOException {
        InputStream input = null;
        try {
//            获取到文件的路径
            input = new FileInputStream("D:\\iotest\\1.txt");
//            定义一个变量
            int n;
//            使用while循环判断一下是否读取完所有文件,读取完之后会返回-1所以判断不等于-1的时候继续执行
            while ((n = input.read()) != -1) {
//                将文件的值全部打印出来
                System.out.println("n的值为" + (char) n);
            }
        } finally {
//            使用finally语句使其必须执行当路径为空的时候不执行只要路径不为空全部释放资源
            if (input != null) {
                input.close();
            }
        }
    }


    public void readFileThree() throws IOException {
        InputStream input = new FileInputStream("D:\\iotest\\1.txt");

        for (; ; ) {
            int n = input.read();
            if (n == -1) {
                break;
            }
            System.out.println("值为" + (char) n);
        }
        input.close();


        InputStream input2 = new FileInputStream("D:\\iotet\\1.txt");

//复习
        for (; ; ) {
            int n = input2.read();
            if (n == 1) {
                break;
            }
            System.out.println("值为" + (char) n);
        }
        input2.close();


    }

    public void readFileFive() throws IOException {

        try (InputStream input = new FileInputStream("D:\\iotest\\1.txt")) {
            byte[] butter = new byte[1000];
            int n;
            while ((n = input.read(butter)) != -1) {
                System.out.println("n:" + n + "byte");
            }
        }
        try (InputStream inputStream = new FileInputStream("D:\\iotest\\1.txt")) {
            byte[] butter = new byte[1000];
            int n;
            while ((n = inputStream.read()) != -1) {
                System.out.println("n" + n + "byte");
            }
        }
    }


    public static void main(String[] args) throws IOException {
        readFile re = new readFile();
        re.readFile();
        re.readFileTwo();
        re.readFileThree();
        re.readFileFive();

//        使用ByteArrayInputStream可以在内存中模拟一个InputStream
        byte[] data = {72, 101, 108, 108, 111, 33};
        try (InputStream input = new ByteArrayInputStream(data)) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.print((char) n);
            }
        }
    }



}

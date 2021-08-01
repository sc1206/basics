package com.company.ShuRu;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class writeFile {
    public void writeFileOne() throws IOException {
        OutputStream output = new FileOutputStream("D:\\iotest\\1.txt");
/*        output.write(72);
        output.write(101);
        output.write(108);
        output.write(108);
        output.write(111);*/
//        每次写一个字节特别麻烦可以一次性写入若干字节
     /*   output.write("Hello".getBytes("UTF-8"));
*/
//        和InputStream一样万一发生不确定异常，会导致资源不能释放
        try (OutputStream output2 = new FileOutputStream("D:\\iotest\\1.txt")) {
            output2.write("Hello,world".getBytes("UTF-8"));
        }
    }
    public static void main(String[] args) throws IOException {
        byte[] data;
        try (ByteArrayOutputStream bainput = new ByteArrayOutputStream()) {
            bainput.write("Hello".getBytes("UTF-8"));
            bainput.write("World!".getBytes("UTF-8"));
            data = bainput.toByteArray();
        }
        System.out.println(new String(data, "UTF-8"));
        writeFile writeFile = new writeFile();
        writeFile.writeFileOne();
    }
}
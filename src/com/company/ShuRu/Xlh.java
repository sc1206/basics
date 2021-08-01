package com.company.ShuRu;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Xlh {
    public static void main(String[] args) throws IOException {

//        序列化文件
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            output.write(12345);
            output.writeUTF("Hello");
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));

//        反序列化
      /*  try (ObjectInputStream input=new ObjectInputStream(buffer)){
            int n=input.readInt();
            String s=input.readUTF();
            Double d =(Double) input.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}

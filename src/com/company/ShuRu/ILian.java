package com.company.ShuRu;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class ILian {
    public static void main(String[] args) throws IOException {
        byte[] data = "hello,world".getBytes("UTF-8");
        try (CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.print((char) n);
            }
            System.out.println("Total read" + input.getByteRead() + "bytes");
        }
    }
}
class CountInputStream extends FilterInputStream {
    private int count = 0;
    protected CountInputStream(InputStream in) {
        super(in);
    }
    public int getByteRead() {
        return this.count;
    }
    public int read() throws IOException {
        int n = in.read();
        if (n != -1) {
            this.count++;
        }
        return n;
    }
    public int read(byte[] b, int off, int len) throws IOException {
        int n = in.read(b, off, len);
        this.count += n;
        return n;
    }
}
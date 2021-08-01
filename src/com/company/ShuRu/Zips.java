package com.company.ShuRu;

import javax.imageio.IIOException;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zips {
  /*  public static void zipsInput() throws IIOException {

        File f = new File("D:\\iotest");
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(f))) {
            ZipEntry entry;
            while ((entry = zip.getNextEnty()) != null) {
                String name = entry.getName();
                if (!entry.isDirectory()) {
                    int n;
                    while ((n = zip.read()) != -1) {

                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

 *//*       try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(f))) {
            File[] fs1 = f.listFiles();
            for (File file : fs1) {
                zip.putNextEntry(new ZipEntry(fs1.getName));
                zip.write(getFileDataAsBytes(fs1));
                zip.closeEntry();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
    }*/
}

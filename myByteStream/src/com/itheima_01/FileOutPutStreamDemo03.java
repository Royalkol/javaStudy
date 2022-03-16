package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo03 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myByteStream\\fos.txt",true);
            for(int i=0;i<10;i++){
                fos.write("hello".getBytes());
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

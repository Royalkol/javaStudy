package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt",true);
        //写入数据
        for(int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}

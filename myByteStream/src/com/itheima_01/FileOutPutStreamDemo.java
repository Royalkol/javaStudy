package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        //写入一个字节
//        fos.write(97);
//        fos.write(57);

        //写入一个数组
        byte[] bytes = "sdasda".getBytes();
//        fos.write(bytes);

        //写入指定长度
        fos.write(bytes,1,3);

        fos.close();
    }
}

package com.itheima02;

import java.io.File;

//递归输出目录下所有文件名
public class DiGuiDemo01 {
    public static void main(String[] args) {
       File srcFile =new File("E:\\project");
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile){
        File [] fileArray =srcFile.listFiles();

        if (fileArray!=null){
            for (File file:fileArray
                 ) {
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file);
                }
            }
        }
    }
}

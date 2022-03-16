package com.itheima01;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        int f = fc(3);
        System.out.println(f);
    }

    public static int fc(int n){
        if (n==1){
            return 1;
        }else {
            return n*fc(n-1);
        }
    }
}

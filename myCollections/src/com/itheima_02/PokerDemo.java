package com.itheima_02;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建派牌盒
        ArrayList<String> array=new ArrayList<>();

        //创建花色数组
        String [] colors={"♠","♥","♣","♦"};
        String [] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A",};

        for (String color:colors
             ) {
            for (String number:numbers
                 ) {
                array.add(color+number);
            }
        }

        array.add("小王");
        array.add("小王");
        System.out.println(array);

        //洗牌
        Collections.shuffle(array);

        ArrayList<String> lyx =new ArrayList<String>();
        ArrayList<String> dfq =new ArrayList<String>();
        ArrayList<String> bqq =new ArrayList<String>();
        ArrayList<String> dq =new ArrayList<String>();


        for (int i=0;i<array.size();i++){
            String poke=array.get(i);
            if (i>=array.size()-3){
                dq.add(poke);
            }else if(i%3==0){
                dfq.add(poke);
            }else if(i%3==1){
                lyx.add(poke);
            }
            else if(i%3==2){
                bqq.add(poke);
            }
        }

        System.out.println("lxy的牌是:"+lyx.toString());
        System.out.println("dfq的牌是:"+dfq.toString());
        System.out.println("bqq的牌是:"+bqq.toString());
        System.out.println("dp的牌是:"+dq.toString());

    }
}

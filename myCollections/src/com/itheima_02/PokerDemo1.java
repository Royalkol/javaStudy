package com.itheima_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo1 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        //创建派牌盒
        ArrayList<Integer> array=new ArrayList<Integer>();

        //创建花色数组
        String [] colors={"♠","♥","♣","♦"};
        String [] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2",};

        int index=0;
        for (String number:numbers
             ) {
            for (String color:colors
                 ) {
               hm.put(index,color+number);
               array.add(index);
               index++;
            }
        }

        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        //洗牌
        Collections.shuffle(array);

        TreeSet<Integer> lyxSet =new TreeSet<Integer>();
        TreeSet<Integer> dfqSet =new TreeSet<Integer>();
        TreeSet<Integer> bqqSet =new TreeSet<Integer>();
        TreeSet<Integer> dqSet =new TreeSet<Integer>();

        for (int i=0;i<array.size();i++){
            int x=array.get(i);
            if (i>=array.size()-3){
                lyxSet.add(x);
            }else if(i%3==0){
                dfqSet.add(x);
            }else if(i%3==1){
                bqqSet.add(x);
            }
            else if(i%3==2){
                dqSet.add(x);
            }
        }

        lookPoker("fengqiy",lyxSet,hm);
        lookPoker("fengqiy",dfqSet,hm);
        lookPoker("fengqiy",bqqSet,hm);
        lookPoker("fengqiy",dqSet,hm);
    }

    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name+"的牌是");
        for (Integer key: ts) {
            String poker =hm.get(key);
            System.out.print(poker+"");
        }
        System.out.println();
    }
}

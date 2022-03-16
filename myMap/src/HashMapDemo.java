import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {

        System.out.println("请输入要统计的字符串");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<Character,Integer> hm=new TreeMap<Character,Integer>();

        for (int i=0;i<s.length();i++){
            char key = s.charAt(i);

            Integer value=hm.get(key);

            if (value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }

        StringBuilder sb=new StringBuilder();

        Set<Character> keySet=hm.keySet();
        for (Character key:keySet
        ) {
            Integer value=hm.get(key);
            sb.append(key).append("").append(value).append("");
        }

        System.out.println(sb);


    }
}

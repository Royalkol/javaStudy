import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo01 {
    public static void main(String[] args) {

        Map<String,String> map =new HashMap<String, String>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

//        Set<String> keySet=map.keySet();
//        for (String key:keySet
//             ) {
//            String value=map.get(key);
//            System.out.println(value);
//        }

        Set<Map.Entry<String,String>> entry =map.entrySet();
        for (Map.Entry<String,String> me:entry
             ) {
            String key = me.getKey();
            String value = me.getValue();

            System.out.println(key+value);
        }
    }
}

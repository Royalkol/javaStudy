import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class CollecttionDemo {

    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        array.add("java");
        array.add("hello");
        array.add("world");

//        Iterator<String> it =array.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println(it.next());

        ListIterator<String> lit=new ArrayList<String>().listIterator();
//        System.out.println(array.toString());

        for (String a:array
             ) {
            System.out.println(a);
        }
    }
}

package itheima02;

public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> g1=new GenericImpl<String>();
        g1.show("lslal");

        GenericImpl<Integer> g2=new GenericImpl<Integer>();
        g2.show(30);
    }
}

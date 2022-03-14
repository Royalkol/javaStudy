public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        int [] arr =new int [3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String sb = sb();

        arr[0]=200;
        arr[1]=100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }

    public  void xxx(){
        System.out.println("aaaa");
    }


    public static String sb(){
        System.out.println("aaaa");
        return "aa";
    }
}

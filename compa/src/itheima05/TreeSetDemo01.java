package itheima05;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo01 {

    public static void main(String[] args) {
        TreeSet <Student> ts =new TreeSet<>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int num =s1.getAge()-s2.getAge();
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        Student s1= new Student("xishi",29);
        Student s2= new Student("wangzhaojun",28);
        Student s3= new Student("diaocan",30);
        Student s4= new Student("yangyuhuan",33);
        Student s5= new Student("lingqingxia",33);
        Student s6= new Student("lingqingxia",33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s:ts
        ) {
            System.out.println(s.toString());
        }
    }

}

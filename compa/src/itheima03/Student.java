package itheima03;

public class Student implements Comparable<Student>{
    //姓名
    private String name;
    //年龄
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        int num =this.age-student.age;
        int num2=num==0?this.name.compareTo(student.name):num;
        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统
 */
public class StudentManager {
    /*
        1:用输出语句完成主界面的编写
        2:用Scanner实现键盘录入数据
        3:用switch语句完成操作的选择
        4:用循环完成再次到主界面
     */
    public static void main(String[] args) {
        //创建集合对象 用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        //用输出语句完成主界面的编写
        while (true) {
            System.out.println("---------欢迎来到学生关系系统--------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//jvm退出
//                    break;
            }
        }
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        String sid;
        //为了程序能够回到此处 我们用循环方法
        while (true) {
            System.out.println("请输入学生学号");
            sid = scanner.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号以占用,请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄");
        String age = scanner.nextLine();
        System.out.println("请输入学生居住地");
        String address = scanner.nextLine();
        //创建学生对象接收值
        Student student = new Student(sid, name, age, address);
        //将学生对象添加到集合中
        array.add(student);
        System.out.println("添加学生成功");
    }

    //查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息,请先添加信息在查询");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        //将集合中数据去除按照对应的格式显示年龄信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getSid() + "\t" + student.getName() + "\t" +
                    student.getAge() + "岁\t\t" + student.getAddress());
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号");
        String sid = scanner.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("改信息不存在,请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }
    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号");
        String sid = scanner.nextLine();
        System.out.println("请输入新学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入新学生年龄");
        String age = scanner.nextLine();
        System.out.println("请输入新学生居住地");
        String address = scanner.nextLine();
        //创建学生对象接收值
        Student s = new Student(sid, name, age, address);

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("改信息不存在,请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }
        System.out.println("删除学生成功");
    }

    //判断学号是否被占用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

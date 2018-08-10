package cn.day18_Collections.cn.itcast_01.cn.itcast_02;

import java.util.Comparator;

/**
 * Created by Gypsophila on 2018/5/7.
 */
public class Student implements Comparable<Student>{
    private int age;
    private String name;

    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;
        int num2 = num == 0?this.name.compareTo(o.name):num;

        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

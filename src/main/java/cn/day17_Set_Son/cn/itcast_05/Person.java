package cn.day17_Set_Son.cn.itcast_05;

import cn.itclass_02.Student;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * 如果一个类的元素想要进行自然排序，就必须实现自然排序接口
 *
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int num = this.name.compareTo(o.getName());

            int num2 = num==0?this.age - o.getAge() : num;


        return num2;
    }
}

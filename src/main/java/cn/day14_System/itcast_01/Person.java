package cn.day14_System.itcast_01;

/**
 * Created by Gypsophila on 2018/4/10.
 */
public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象被回收了" + this);
        super.finalize();
    }
}

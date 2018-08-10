package cn.day16_Generic.cn.itcast_01.cn.itcast_07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * 泛型高级(通配符)
 * ?:任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * ? extends E:
 * ? super E:
 *
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<Object>();
        //Collection<Object> c3 = new ArrayList<Animal>();
        //Collection<Object> c4 = new ArrayList<Dog>();
        //Collection<Object> c5 = new ArrayList<Cat>();
        Collection<?> c2 = new ArrayList<Object>();

        //? extends E:向下限定，向下限定E及其子类
        //Collection<? extends Animal> c9 = new ArrayList<Object>();
        Collection<? extends Animal> c10 = new ArrayList<Animal>();
        Collection<? extends Animal> c11 = new ArrayList<Dog>();
        Collection<? extends Animal> c12 = new ArrayList<Cat>();

        //? super E:向上限定，E及其父类
        Collection<? super Animal> c13 = new ArrayList<Object>();
        Collection<? super Animal> c14 = new ArrayList<Animal>();
    }

}

class Animal{

}
class Dog extends Animal{

}

class Cat extends Animal{

}
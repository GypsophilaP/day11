package cn.day16_List_Sun.cn.itcast_01.cn.itcast_05;

import java.util.LinkedList;

/**
 * Created by Gypsophila on 2018/4/24.
 *
 * 自定义的栈集合
 *
 */
public class MyStack {
    private LinkedList link;

    public MyStack(){
        link = new LinkedList();
    }

    public void push(Object obj){
        link.addFirst(obj);

    }
    public Object pop(){
        return link.removeFirst();
    }

    public boolean isEmpty(){
        if (link.size() == 0){
            return true;
        }else{
            return false;
        }
    }

}

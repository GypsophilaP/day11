package cn.day19_Exception.cn.itcast_01;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * 异常：程序出现了不正常的情况
 *
 * 程序的异常 Throwable
 *      严重问题：Error 我们不处理 这种问题一般都是很严重的问题 比如内存溢出
 *      问题      Exception
 *          编译期问题 不是RuntimeException异常都是编译期异常 必须进行处理，因为你不处理，编译就不能通过
 *          运行时问题 RuntimeException 这种问题我们也不处理 这个问题出现肯定是我们的代码不够严谨 需要修正代码的
 *  如果程序出现了问题，我们没有做任何处理，最终jvm会做出磨人的处理
 *  把异常的名称原因及问题等信息输出在控制台
 *  同时会结束程序
 */
public class ExceptionDemo {
    public static void main(String[] args) {
         int a = 10;
        int b = 2;

        System.out.println(a / b);
        System.out.println("over");
    }

}

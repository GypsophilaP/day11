package cn.day19_Exception.cn.itcast_01.cn.ticast_07;

/**
 * Created by Gypsophila on 2018/8/8.
 *
 * final:最终的意思 修饰类成员变量成员方法
 *finally:是异常处理的一部分,用于释放资源
 * finalize:是Object类的一个方法 用于垃圾回收
 *
 * 2:如果catch里面有return语句 请问finally里面的代码还会执行吗
 *      会
 *      前
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println(getInt());

    }
    public static int getInt(){
        int a = 10;
        try{
            System.out.println(a / 0);
            a = 20;
        }catch (Exception e){
            a = 30;
            return a;
        }finally {
            a = 40;
        }
        return a ;
    }
}

package cn.day14_System.itcast_01.itcast_02;

/**
 * Created by Gypsophila on 2018/4/10.
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("12314");
        System.out.println(System.currentTimeMillis());
        //单独的时间目前意义不大
        //那么他有什么用呢
        //System.exit(0);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}

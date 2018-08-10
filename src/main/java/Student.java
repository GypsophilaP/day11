/**
 * Created by Gypsophila on 2018/3/19.
 */

/**
 *Object类的方法
 *  public int hashCode():返回该对象的哈希码值
 *
 *  public final Class<?> getClass():返回次Object的运行时类
 *      Class类的方法：
 *          public String getName()：以String的形式返回此Class对象所表示的类的名称
 *
 * */

public class Student extends  Object {
        public  static void main(String[] args){
            Student s1 = new Student();

            System.out.println(s1.hashCode());

            Student s = new Student();
            Class c = s.getClass();
            String str = c.getName();
            System.out.println(str);

        }
}

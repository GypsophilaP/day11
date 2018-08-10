package cn.day12.cn.itclass_01.cn.itclass_07;

/**
 * Created by Gypsophila on 2018/4/2.
 */
public class StringDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            s = s + arr[i] + ",";
        }
        s = s + arr[arr.length-1] + "]";
        System.out.println(s);
        String s2 = "abc";
        char[] chs = s2.toCharArray();
        char temp = ' ';
        for (int i = 0; i < chs.length/2; i++) {
            temp = chs[i];
            chs[i] = chs[chs.length-i - 1];
            chs[chs.length-i - 1] = temp;
        }
        s2 = String.valueOf(chs);

        System.out.println(s2);

        String s3 = "ajava afafgfjava fdsagfsajava gdsafdgfasdjava";
        int count = 0;
        int flag = 0;
        String str3 = "java";
        char[] st3 = str3.toCharArray();
        char[] ch = s3.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == st3[0]){
                for (int j = 1; j < st3.length; j++) {

                    if(ch[i + j] == st3[j]){
                        flag++;
                    }
                }
                if(flag == st3.length -1){
                    count++;
                }
                flag = 0;
            }
        }
        System.out.println(count);
    }
}

package cn.day15_Regex.cn.itcast_01;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/9.
 *  正则表达式：是指一个用来描述或者匹配一系列符合某个句法规则的字符串的单个字符串
 *  其实就是一种规则。有自己特殊的应用
 *
 *
 *
 * 正则表达式规则：
 *  A:字符
 *      x 字符x 举例 ‘‘字符表示字符a
 *      \\反斜线字符
 *      \r 回车
 *
 *  B;字符类
 *      [abc] a/b/c 简单类
 *      [^abc] 任何字符，除了a/b/c否定
 *      [a-zA-Z]a到z 或A到Z，两头的字母包括在内（范围）
 *      [0-9]0到9的字符都包括
 *  C;预定义字符类
 *      .任何字符 \.
 *      \d 0-9
 *      \D ^0-9
 *      \w 单词字符[a-Z 0-9]
 *
 *  D:边界匹配器
 *      ^ 行的开头
 *      $ 行的结尾
 *      \b 单词边界 就是不是单词字符的地方
 *  E:Greedy 数量词
 *  *	匹配前面的子表达式零次或多次。例如，zo* 能匹配 "z" 以及 "zoo"。* 等价于{0,}。
 +	匹配前面的子表达式一次或多次。例如，'zo+' 能匹配 "zo" 以及 "zoo"，但不能匹配 "z"。+ 等价于 {1,}。
 ?	匹配前面的子表达式零次或一次。例如，"do(es)?" 可以匹配 "do" 、 "does" 中的 "does" 、 "doxy" 中的 "do" 。? 等价于 {0,1}。
 {n}	n 是一个非负整数。匹配确定的 n 次。例如，'o{2}' 不能匹配 "Bob" 中的 'o'，但是能匹配 "food" 中的两个 o。
 {n,}	n 是一个非负整数。至少匹配n 次。例如，'o{2,}' 不能匹配 "Bob" 中的 'o'，但能匹配 "foooood" 中的所有 o。'o{1,}' 等价于 'o+'。'o{0,}' 则等价于 'o*'。
 {n,m}	m 和 n 均为非负整数，其中n <= m。最少匹配 n 次且最多匹配 m 次。例如，"o{1,3}" 将匹配 "fooooood" 中的前三个 o。'o{0,1}' 等价于 'o?'。请注意在逗号和两个数之间不能有空格。
 *
 *
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your QQ");
        String qq = sc.nextLine();

        System.out.println("checkQQ:" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
        String regex = "[1-9][0-9]{4,14}";
        return qq.matches(regex);


    }
}

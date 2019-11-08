package Lv2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class lv2的1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //添加数据
        list.add("tnl");
        list.add("我想突破lv2");
        list.add("但我真的搞不来");
        list.add("真的tnl");

        System.out.println("取出tnl:");
        String s1 = list.get(0);
        System.out.println(s1);
        System.out.println(" ");

        System.out.println("用迭代器取出所有：");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s2 = it.next();
            System.out.println(s2);
        }

        System.out.println(" ");
            System.out.println("把真的tnl改成一点也不难：");
            String st = new String("一点也不难");
            list.set(3,st);
            String s3 = list.get(3);
            System.out.println(s3);
            System.out.println(" ");

            int i = (int)(Math.random()*list.size());
        System.out.println("随机获取一个元素:  " + list.get(i));
        System.out.println(" ");

        System.out.println("移除（3）再输出全部：");
        list.remove(3);
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String s4 = it1.next();
            System.out.println(s4);
            System.out.println(" ");
        }
    }
}



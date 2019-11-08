package Lv2;

import java.util.Iterator;
import java.util.TreeSet;

public class lv2的2 implements Comparable<Object>{
    String name;
    int age;
    @Override
    public int compareTo(Object o) {
        lv2的2 lv2 = (lv2的2) o;
        int result = age>lv2.age? 1:(age == lv2.age?0:-1);
        return result;}

    public lv2的2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public static void main(String[] args) {
        lv2的2 p0 = new lv2的2("王某某", 18);
        lv2的2 p1 = new lv2的2("李某某", 12);
        lv2的2 p2 = new lv2的2("张某某", 19);
        lv2的2 p3 = new lv2的2("刘某某", 30);
        lv2的2 p4 = new lv2的2("陈某某", 17);

        TreeSet<lv2的2> tree = new TreeSet<>();
        tree.add(p0);
        tree.add(p1);
        tree.add(p2);
        tree.add(p3);
        tree.add(p4);

        Iterator<lv2的2> it = tree.iterator();
            it = tree.headSet(p0).iterator();
            System.out.println(" ");
            System.out.println("输出王某某之前的：");
            while (it.hasNext()){
                lv2的2 p = (lv2的2) it.next();
                System.out.println(p.getName() + "  " +p.getAge());

                it = tree.subSet(p4,p3).iterator();
                System.out.println(" ");
                System.out.println("输出陈和刘之间的");
                while (it.hasNext()){
                    lv2的2 p01 = (lv2的2) it.next();
                    System.out.println(p01.getName() +"  "+ p01.getAge());
                }
            }
        }
    }

package Lv2;

import java.util.*;

public class PeopleMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        People p1 = new People("19", "张某");
        People p2 = new People("12", "王某");
        People p3 = new People("18", "李某");
        People p4 = new People("20", "赵某");
        People p5 = new People("03", "石某");

        map.put(p5.getage(), p5.getName());
        map.put(p2.getage(), p2.getName());
        map.put(p3.getage(), p3.getName());
        map.put(p1.getage(), p1.getName());
        map.put(p4.getage(), p4.getName());

        Set<String> set = map.keySet();
        Iterator <String> it = set.iterator();
        System.out.println("HashMap实现时：");
        while (it.hasNext()){
            String str = it.next();
            String name = map.get(str);
            System.out.println(str + "  " + name);
        }

        TreeMap<String,String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator <String> it1 =treemap.keySet().iterator();
        System.out.println("TreeMap实现时：");
        while (it1.hasNext()){
            String str = it1.next();
            String name = treemap.get(str);
            System.out.println(str + "  " + name);
        }
    }
}

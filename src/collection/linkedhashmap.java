package collection;

import java.util.*;

/**
 * 本篇主要是为了学习LinkedHashMap的知识
 */
public class linkedhashmap {
    public static void main(String[] args) {
        //首先是构造方法
        //构造方法1，包含了一个容量2，和一个负载因子0，75
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(2,0.75f);
        //构造方法2，包含了一个容量2
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
        //构造方法3，什么都不写，默认容量16，默认负载因子0.75f
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        //构造方法4，传入一个map，默认负载因子0.75f，默认容量是map.size()/0.75f+1中的比较大的那个
        Map<Integer,Integer> map = new HashMap<>();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(map);
        //构造方法5，根据容量，负载因子，和保持顺序创建
        int k = 5;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(10,0.75f,true){
            //这里重写了判断是不是要移走最先进来的那个map
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>5;
            }
        };
        //默认的顺序就是根据插入的顺序，不会根据数值的改变而改变输出的顺序
        //如果是设置了true，那就是操作的顺序，举例如下
        linkedHashMap5.put("a",5);
        linkedHashMap5.put("b",6);
        linkedHashMap5.put("c",7);
        Iterator<Map.Entry<String ,Integer>> iterator = linkedHashMap5.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
        linkedHashMap5.put("b",8);
        iterator = linkedHashMap5.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }

    }
}

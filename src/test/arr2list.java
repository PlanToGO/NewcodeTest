package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目中常见的类型转换的函数
 */

public class arr2list {
    public static void main(String[] args) {
       //基本数据类型数组转ArrayList
       int[] arr = new int[]{3,5,4,3,12};
       ArrayList arrayList = new ArrayList();
       for (int num:arr){
           arrayList.add(num);
       }
       //对象类放入ArrayList
        String[] arrstr = new String[]{"1","2","3","4","5"};
       ArrayList<String> arrayListstr = new ArrayList<>(Arrays.asList(arrstr));
       //ArrayList转换为数组
        ArrayList list2array = new ArrayList();
        list2array.add("1");
        list2array.add("2");
        String[] array = (String[]) list2array.toArray(new String[list2array.size()]);
        //数组中的string转化为int(流、转换、toarray)
        int[] arrint = Arrays.stream(arrstr).mapToInt(Integer::parseInt).toArray();
        //数组中的int转换为Integer(流、装箱、toarray、转换)
        Integer[] arrinteger = Arrays.stream(arrint).boxed().toArray(Integer[]::new);
        for (Integer i:arrinteger){
            System.out.println(i);
        }
    }
}

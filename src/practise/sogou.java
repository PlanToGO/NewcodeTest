package practise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class sogou {
    static LinkedHashMap<String,Long> linkedHashMap;
    public static <K, V> Map.Entry<K, V> getHead(LinkedHashMap<K, V> map) {
        return map.entrySet().iterator().next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long len = sc.nextInt();
        linkedHashMap=new LinkedHashMap<String,Long>((int)Math.ceil(len/0.75f)+1,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Long> eldest) {
                return size()>len;
            }
        };
        while (sc.hasNext()){
            String key = sc.next();
            long value = Long.valueOf(sc.next());
            if (linkedHashMap.containsKey(key)){
                if (value>linkedHashMap.get(key)){
                    linkedHashMap.replace(key,value);
                }
            }else {
                if (linkedHashMap.size()>=len){
                    System.out.println(getHead(linkedHashMap).getKey()+" "+getHead(linkedHashMap).getValue());
                }
                linkedHashMap.put(key,value);
            }
        }
    }
}
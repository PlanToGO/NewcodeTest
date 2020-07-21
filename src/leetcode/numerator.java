package leetcode;

import java.util.HashMap;
import java.util.Map;

public class numerator {
    public static String fractionToDecimal(int numrator,int denominator){
        //如果除数是0
        if(numrator==0) return "0";
        //如果被除数是0，返回string可以表示的最大值
        if(denominator==0) return String.valueOf(Integer.MAX_VALUE);
        //如果有一个是负数
        String res = new String();
        if ((numrator)<0^(denominator)<0)
            res=res+"-";

        //考虑到int数据类型的溢出情况，所以都要取一个绝对值
        long num = Math.abs((long)numrator);
        long den = Math.abs((long)denominator);

        //整数部分和小数部分区分
        long ren=num/den;
        long rem=num%den;
        res=res+String.valueOf(ren);

        //如果没有小数的部分，那就返回
        if (rem == 0) return res;
        //加上小数点
        res+=".";

        //创建一个map用来存放小数点后的位数和数字，其中beg表示总长度
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        int beg = res.length();
        while (rem>0){
            //每次都让余数乘10再除以被除数
            rem = rem*10;
            ren = rem/den;
            //如果map中已经有了这个key了，那么就把这个key所包含的内容输出显示
            if (map.containsKey(rem)){
                String part1 = res.substring(0,map.get(rem));
                String part2 = res.substring(map.get(rem));
                res = part1+"("+part2+")";
                break;
            }else {
                res+=String.valueOf(ren);
                map.put(rem,beg);
            }
            beg++;
            rem=rem%den;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1,0));
    }
}

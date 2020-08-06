package test;

/**
 * 阶乘相关的内容
 */


public class nzero {
    /**
     * 求n的阶乘的时候，得到的数字末尾有多少个0
     * 思路：能末尾有0的，只有2*5才能得到（4*5可以等价为2*5，以此类推）
     * 在n！中，能被2整除的数字肯定比能被5整除的数字多，所以用5比较合适
     * @param n
     * @return
     */
    public static int howmanyzerointheend(int n){
        int sum = 0;
        while (n!=0){
            sum += n/5;
            n /= 5;
        }
        return sum;
    }

    /**
     * 求n的阶乘的时候，得到的数字转换为2进制的时候，末尾的1最早出现在哪一位
     * 思路：其实这个题目就是求有多少个2可以除，类似于上边的有多少个0
     * @param n
     * @return
     */
    public static int inwhichposition(int n){
        int sum = 0;
        while (n!=0){
            sum += n/2;
            n /= 2;
        }
        return sum;
    }

    /**
     * 大数相乘，原理就是小学学的乘法笔算的方法
     * @param s1 第一个数
     * @param s2 第二个数
     * @return
     */
    public static String mul(String s1 , String s2){
        //先把字符串转换为字符数组
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int len = c1.length+c2.length;
        //用来存放两个数字的积，字符的初始值都是0
        char[] c = new char[len];
        //从大整数的低位开始计算，也就是从字符串的末尾开始计算
        for (int i=c1.length-1;i>=0;i--){
            int index = len-1;
            int res = 0;//用来存放进位的
            for (int j=c2.length-1;j>=0;j--){
                //先算出来这一位上的乘积
                int temp = (c1[i]-'0')*(c2[j]-'0')+c[index]+res;
                //把进位存起来
                res = temp/10;
                //把余数放到最终的结果里头
                c[index--] = (char)(temp%10);
            }
            //每一趟乘出来的进位都要保存
            c[index] = (char)res;
            len--;
        }
        //最后把c中的字符加上'0'
        for (int i=0;i<c.length;i++){
            c[i] += '0';
        }
        String s = new String(c);
        //判断一下第一位是不0，如果是0的话就要舍弃掉
        if (c[0]=='0') return s.substring(1);
        else return s;
    }

    /**
     * 这个部分用来写阶乘的部分，思路是通过上边的大数相乘，然后用一个
     * for循环，求得s的值，这个值就是阶乘的数值。
     * @param n
     * @return
     */

    public static String factorial(int n){
        String s = "1";
        Integer t = null;
        for (int i=2 ;i<=n;i++){
            t = i;
            s = mul(s,t.toString());
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(howmanyzerointheend(789));
        System.out.println(factorial(789));
    }
}

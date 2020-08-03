package leetcode;

/**
 * Excel表列名称  题号：168
 * 思路：其实考察的就是进制转换，但是需要注意一点的是，如果是满26的时候，并不进位
 * 而是输出一个Z，所以在c==0的时候要注意对n进行修正。
 */

public class converttotitle {
    public String convertToTitle(int n){
        StringBuilder sb = new StringBuilder();
        while (n>0){
            int c = n%26;
            if (c==0){
                c=26;
                n=n-1;
            }
            sb.insert(0,(char)('A'+c-1));
            n /=26;
        }
        return sb.toString();
    }
}

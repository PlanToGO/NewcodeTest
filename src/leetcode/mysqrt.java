package leetcode;

public class mysqrt {
    public static int mySqrt1(int x){
        if (x == 0) return 0;
        int answer = (int) Math.exp(0.5*Math.log(x));
        return (long)(answer+1)*(answer+1) <= x ? answer+1 : answer;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt1(4));
        System.out.println(mySqrt1(36));
        System.out.println(mySqrt1(87234));
    }
}

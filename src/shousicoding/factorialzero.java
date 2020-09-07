package shousicoding;

public class factorialzero {
    public static int howmanyzero(int n){
        int sum = 0;
        while (n!=0){
            sum += n/5;
            n /= 5;
        }
        return sum;
    }
    public static int whereisone(int n){
        int sum = 0;
        while (n!=0){
            sum += n/2;
            n /= 2;
        }
        return sum;
    }
}

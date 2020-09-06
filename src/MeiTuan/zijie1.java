package MeiTuan;

import java.util.Scanner;

public class zijie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        while (len>0){
            int[] arr= new int[8];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(area(arr)+" "+isClockWise(arr));
            len--;
        }
    }

    private static String isClockWise(int[] arr) {
        int x1=arr[0],y1=arr[1];
        int x2=arr[2],y2=arr[3];
        int x3=arr[4],y3=arr[5];
        if ((x3-x1)*(y2-y1)-(x2-x1)*(y3-y1)>0){
            return "yes";
        }else {
            return "no";
        }
    }

    private static int area(int[] arr) {
        int x1=arr[0],y1=arr[1];
        int x2=arr[6],y2=arr[7];
        int x0=arr[2],y0=arr[3];
        if (y1==y2){
                int len=Math.abs(x2-x1);
                return Math.abs(y0-y1)*len;
            } else if (x1==x2) {
            int len=Math.abs(y2-y1);
            return Math.abs(x0-x1)*len;
        }else
            {
                int A=x2-x1,B=y1-y2,C=y1*x2-y2*x1;
                int len = (int)(Math.abs(A*x0+B*y0+C)/Math.sqrt(Math.pow(A,2)+Math.pow(B,2)));
                return (int)(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))*len);
            }
    }
}

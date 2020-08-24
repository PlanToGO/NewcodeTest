package MeiTuan;

import java.util.*;

public class meituan8 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] max = new int[len];
        for (int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<len;i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j=i+1;j<len;j++){
                arrayList.add((int)Math.floor((sum(arr,i,j))/(j-i+1)));
            }
            Collections.sort(arrayList);
            if (arrayList.size()!=0){
                max[i]=arrayList.get(arrayList.size()-1);
            }
        }
        Arrays.sort(max);
        System.out.println(max[max.length-1]);
    }

    /**
     * 求和函数
     * @param arr 数组
     * @param start 开始的下标，包含
     * @param end 结束的下标，包含
     * @return
     */
    public static int sum(int[] arr,int start,int end){
        int sum = 0;
        for (int i=start;i<end+1;i++){
            sum += arr[i];
        }
        return sum;
    }
}

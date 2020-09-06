package practise;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution{
    public static int[] two_sum(int[] array,int target,int length){
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (array[i]+array[j]==target){
                    int[] ans = new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    arrayList.add(ans);
                    break;
                }
            }
        }
        return arrayList.get(0);
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3};
        int length=4;
        int target = 1;
        System.out.println(Arrays.toString(two_sum(a,target,length)));
    }
}

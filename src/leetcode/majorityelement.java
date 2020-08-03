package leetcode;

import java.util.HashMap;

public class majorityelement {
    public static int majorityElement(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            hashMap.put(nums[i],1);
        }
        int ans = 0;
        for (int num:hashMap.keySet()){
            int sum = hashMap.get(num);
            if (sum>nums.length/2){
                ans=sum;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] a = new int[]{3,2,3};
        System.out.println(majorityElement(a));
    }
}

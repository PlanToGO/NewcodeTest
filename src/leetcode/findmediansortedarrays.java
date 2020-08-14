package leetcode;

/**
 * 题目：寻找两个正序数组的中位数 题号：4
 */

public class findmediansortedarrays {
    public static boolean isEven(int len){
        if (len%2==0) return true;
        return false;
    }
    public static double find(int[] nums1,int[] nums2){
        int[] result = new int[nums1.length + nums2.length];
        double ans;
        //遍历数组，有两个指针，i和j分别为分治的左右两个分支的指针，从而判断判断到哪个
        //位置，index表示当前排序的位置
        for (int index = 0, i = 0,j = 0;index < result.length; index++){
            if (i >= nums1.length)
                result[index] = nums2[j++];
            else if (j >= nums2.length)
                result[index] = nums1[i++];
            else if (nums1[i] > nums2[j])
                result[index] = nums2[j++];
            else
                result[index] = nums1[i++];
        }
        if (isEven(result.length)) return (double) (result[result.length/2-1]+result[result.length/2])/2;
        return result[result.length/2];
    }

    public static void main(String[] args) {
        int[] a = new int[]{};
        int[] b = new int[]{3,6};
        System.out.println(find(a,b));
    }
}

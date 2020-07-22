package leetcode;
//题目：旋转数组的最小数字 题目序号：154

/**
 * 采用二分法进行查找
 */

public class minarray {
    public int minArray(int[] numbers){
        int i = 0, j = numbers.length-1;
        while (i < j){
            int m = (i+j)/2;
            if (numbers[m] > numbers[j]) i=m+1;
            else if (numbers[m] < numbers[j]) j=m;
            else j--;
        }
        return numbers[i];
    }
}

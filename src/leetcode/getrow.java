package leetcode;

import java.util.ArrayList;
import java.util.List;

public class getrow {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex==0) return result;
        result.add(1);
        if (rowIndex==1) return result;
        List<Integer> pre_result = new ArrayList<>();
        pre_result = result;
        int now_row = 1;
        while (now_row<rowIndex){
            result.add(1);
            for (int i=1;i<=now_row;i++){
                result.set(i,(pre_result.get(i-1)+pre_result.get(i)));
            }
            pre_result=new ArrayList<>(result);
            now_row++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}

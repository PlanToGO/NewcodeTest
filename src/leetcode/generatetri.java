package leetcode;
/**
 * 题目：杨辉三角 编号：118
 */

import java.util.ArrayList;
import java.util.List;

public class generatetri {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows==0)return result;
        for (int i=0;i<numRows;i++){
            ArrayList<Integer> current = new ArrayList<Integer>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    current.add(1);
                }else {
                    current.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(current);
        }
        return result;
    }

    public List<List<Integer>> generate1(int numRows){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows==0) return result;
        result.add(new ArrayList<>());
        //设定第一行为1
        result.get(0).add(1);

        //遍历到每一行
        for (int i=1;i<numRows;i++){
            List<Integer> current = new ArrayList<>();
            //pre为每行的前一行元素
            List<Integer> pre = result.get(i-1);
            //每行的第一个元素为1
            current.add(1);
            for (int j=1;j<=i;j++){
                //判断逻辑，避免下标越界，否则会出现[0][1]这样的越界错误
                if (j>=pre.size()){
                    current.add(pre.get(j-1));
                }else {
                current.add(pre.get(j-1)+pre.get(j));
                }
            }
            //每行的最后一个元素为1
            current.add(1);
            //把所有行提取到result中
            result.add(current);
        }
        return result;
    }
}

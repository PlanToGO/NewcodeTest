package leetcode;

/**
 * 题目：最长公共前缀  题号：14
 * 思路：暴力搜索就完事了，用flag来定义是不是要添加这个字符
 */


public class longestcommonprefix {
    public String longestCommonPrefix(String[] strs){
        StringBuffer prefix = new StringBuffer();
        if (strs.length==0) return new String();
        boolean flag = true;
        for (int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j=1;j< strs.length;j++){
                if (i==strs[j].length()||c!=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if (flag==false) break;
            prefix.append(c);
        }
        return new String(prefix.toString());
    }
}

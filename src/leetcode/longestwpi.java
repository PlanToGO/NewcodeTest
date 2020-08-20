package leetcode;

public class longestwpi {
    public int longestWPI(int[] hours){
        int len= hours.length;
        for (int i=0;i<len;i++){
            hours[i]=hours[i]>8?1:-1;
        }
        int res=0;
        for (int i=0;i<len;i++){
            int count=0;
            for (int j=i;j<len;j++){
                count += hours[j];
                if (count>0)
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}

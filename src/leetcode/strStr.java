package leetcode;

public class strStr {
    public int strstr(String haystack, String needle){
        int a = haystack.length();
        int b = needle.length();
        for (int i = 0 ; i<a-b+1;++i){
            if (haystack.substring(i,i+b).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

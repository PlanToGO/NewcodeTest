package LCS;

import java.util.Scanner;

public class KMP {
    static char[] s,p;
    static int[] nxt = new int[1000000];

    public static void main(String[] args) {
        input();
        buildNxt();
        search();
        output();
    }

    private static void output() {
        for (int i=0;i<p.length;i++){
            System.out.println(nxt[i]);
        }
    }

    /**
     * 查找到底在哪个位置
     */
    private static void search() {
        int tar=0,pos=0;
        while (tar<s.length) {
            if (s[tar] == p[pos]) {
                tar++;
                pos++;
            } else if (pos != 0) pos = nxt[pos - 1];
            else tar++;
            if (pos==p.length){
                System.out.println(tar-pos+1);
                pos=nxt[pos-1];
            }
        }
    }

    /**
     * 构建next序列
     */
    private static void buildNxt() {
        int i=1,now=0;
        while (i<p.length){
            if (p[i]==p[now]){
                now++;
                nxt[i]=now;
                i++;
            }else if (now!=0){
                now = nxt[now-1];
            }else {
                i++;
                nxt[i]=now;
            }
        }
    }

    /**
     * 用于输入两个字符串
     */
    private static void input() {
        Scanner in = new Scanner(System.in);
        //str是目标串，pat是模式串
        String str,pat;

        str=in.next();
        pat=in.next();

        s=str.toCharArray();
        p=pat.toCharArray();

        in.close();
    }
}

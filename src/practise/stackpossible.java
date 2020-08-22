package practise;

import java.util.ArrayList;
import java.util.Stack;

public class stackpossible {
    static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) {
        char[] in={'a','b','c'};
        StackPossible(0,new Stack<Character>(),in,new String());
        for (String a:res){
            System.out.println(a);
        }
    }
    static void StackPossible(int x,Stack<Character> stack,char[] in,String result){
        if (x==in.length&&stack.isEmpty()){
            res.add(result);
        }else {
            Stack<Character> s1 = (Stack<Character>)stack.clone();
            Stack<Character> s2 = (Stack<Character>)stack.clone();
            //如果没有全部进栈
            if (x< in.length){
                s1.push(in[x]);
                StackPossible(x+1,s1,in,result);
            }
            //如果栈不是空的
            if (!s2.isEmpty()){
                String tmp = result+s2.pop();
                StackPossible(x,s2,in,tmp);
            }
        }
    }

}

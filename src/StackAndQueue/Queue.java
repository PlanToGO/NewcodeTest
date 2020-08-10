package StackAndQueue;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    //进队操作，放在队尾
    public void push(int num){
        linkedList.addLast(num);
    }
    //出队操作，使用poll，输出第一个数
    public int get(){
        return linkedList.poll();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    public int size(){
        return linkedList.size();
    }
}

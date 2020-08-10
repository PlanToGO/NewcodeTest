package StackAndQueue;

import java.util.LinkedList;

/**
 * 使用linkedlist对stack进行实现
 */
public class Stack {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    public void push(int num){
        linkedList.addFirst(num);
    }
    public int pop(){
        return linkedList.removeFirst();
    }
    public int peek(){
        return linkedList.getFirst();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    public int getSize(){
        return linkedList.size();
    }

}

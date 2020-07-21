package leetcode;

import java.util.LinkedList;

public class hashset {
    //首先创建一个类型是bucket，即为桶的类型，用来存放key之后的value
    class bucket {
        private LinkedList<Integer> container;

        //构造方法，即创建新的LinkedList作为container
        public bucket() {
            container = new LinkedList<Integer>();
        }

        //bucket中的插入方法，使用LinkedList中的indexOf方法找到有没有这个key，如果是-1表示没有这个key，所以插入
        public void insert(Integer key) {
            int index = this.container.indexOf(key);
            if (index == -1) {
                this.container.addFirst(key);
            }
        }

        //bucket中的删除方法
        public void delete(Integer key) {
            this.container.remove(key);
        }

        //bucket中的查询方法，使用LinkedList中的indexOf方法找到这个key，如果不存在就是-1，如果存在就是
        public boolean exists(Integer key) {
            int index = this.container.indexOf(key);
            return (index != -1);
        }
    }

    //创建一个bucketArray和一个表示array长度的keyRange
    private bucket[] bucketArray;
    private int keyRange;

    //hashset的构造方法，即先把keyRange设置为769，这是一个质数，可以减少潜在的哈希碰撞
    //然后在bucketArray中每一个桶中都放入一个新的桶
    public hashset() {
        this.keyRange = 769;
        this.bucketArray = new bucket[this.keyRange];
        for (int i = 0; i<this.keyRange;++i){
            this.bucketArray[i] = new bucket();
        }
    }

    //计算哈希值的函数
    protected int _hash(int key){
        return (key % this.keyRange);
    }

    //增加的函数
    public void add(int key){
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    //删除的函数
    public void remove(int key){
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    //查看是否存在的函数，如果存在就返回true，否则就返回false
    public boolean contains(int key){
        int bucketIndex = this._hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }
}

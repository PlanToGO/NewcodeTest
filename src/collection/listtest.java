package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class listtest {
    static class book{
        private String name;
        private int ID;

        public book(int ID,String name){
            setID(ID);
            setName(name);
        }

        public String getName() {
            return name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "书"+ID+"的名字是"+name;
        }
    }

    public static void main(String[] args) {
//        ArrayList<book> books = new ArrayList<>();
//        book fengge = new book(1,"bestman");
//        book xiaocui = new book(2,"betterman");
//        book benben = new book(3,"betterman");
//        books.add(fengge);
//        books.add(xiaocui);
//        books.add(benben);
//        //要重写类的toString方法才能正常打印出值
//        System.out.println(books);
//        System.out.println(books.size());
//        Iterator<book> iterator = books.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        book zhangkehui = new book(4,"goodman");
//        books.set(0,zhangkehui);
//        System.out.println(books.get(0));
//        books.set(0,new book(5,"gggggg"));
//        System.out.println(books.get(0));
//        int a = Integer.MAX_VALUE;
//        int c = 88;
//        int b = 0;
//        b = a%1000000007;
//        c  %=1000000007;
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(c);
        char a = '6';
        System.out.println(a-'0');
    }
}

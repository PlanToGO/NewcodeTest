package test;

public class test3 {
    static class book{
        int id;
        String bookname;

        public book(){
            this("调用没有参数的方法");
            System.out.println("造书");
        }
        public book(String name){
            System.out.println("有参数造书");
        }

    }

    public static void main(String[] args) {
        book a = new book();
    }
}

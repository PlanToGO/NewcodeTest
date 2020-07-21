package threadtest;

public class threadtest1 implements Runnable {
    private String name;
    public threadtest1(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0 ; i<10 ; i++){
            System.out.println(name+"运行到了："+ i);
        }
    }

    public static void main(String[] args) {
        threadtest1 thread1 = new threadtest1("线程A");
        threadtest1 thread2 = new threadtest1("线程B");
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}

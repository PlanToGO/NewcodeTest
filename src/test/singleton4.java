package test;

public class singleton4 {
    //将自身实例化为一个属性，并用static修饰
    private static singleton4 instance;
    //构造方法私有化
    private singleton4(){}
    //静态方法返回该实例
    public static singleton4 getInstance(){
        //第一次检查是否实例化过，如果没有进入if模块
        if (instance == null){
            synchronized (singleton4.class){
                //某个线程取得了类锁，实例化对象前第二次检查instance是否被实例化了出来，如果没有，再实例化对象
                if (instance == null){
                    instance = new singleton4();
                }
            }
        }
        return instance;
    }
}

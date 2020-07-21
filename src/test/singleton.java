package test;

public class singleton {
    //将自身实例化对象设置为一个属性，并用static、final进行修饰
    private static final singleton instance = new singleton();
    //构造方法私有化
    private singleton(){}
    //静态方法返回该实例
    public static singleton getInstance(){
        return instance;
    }
}


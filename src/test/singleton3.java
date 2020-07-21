package test;

public class singleton3 {
    //将自身实例化对象设置成为一个属性，并用static修饰
    private static singleton3 instance;
    //构造方法似有化
    private singleton3(){}
    //静态方法返回该实例

    public static synchronized singleton3 getInstance() {
        if (instance == null){
            instance = new singleton3();
        }
        return instance;
    }
}

package test;

public class sington2 {
    //把自身实例化称一个属性，并使用static修饰
    private static sington2 instance;
    //构造方法私有化
    private sington2(){}
    //静态方法返回这个实例
    public static sington2 getInstance(){
        if (instance == null){
            instance = new sington2();
        }
        return instance;
    }
}

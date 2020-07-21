package test;

class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("test.SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("test.SuperClass(int n)");
        this.n = n;
    }
}
// test.SubClass 类继承
class SubClass extends SuperClass{
    private int n;

    SubClass(){ // 自动调用父类的无参数构造器
        System.out.println("test.SubClass");
    }

    public SubClass(int n){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("test.SubClass(int n):"+n);
        this.n = n;
    }
}
// test.SubClass2 类继承
class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("test.SubClass2");
    }

    public SubClass2(int n){ // 自动调用父类的无参数构造器
        System.out.println("test.SubClass2(int n):"+n);
        this.n = n;
    }
}
public class test1{
    public static void main (String args[]){
        System.out.println("------test.SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------test.SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
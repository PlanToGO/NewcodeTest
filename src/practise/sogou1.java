package practise;

public class sogou1 {
    public static void main(String[] args) {
        System.out.println(Test2.a);
    }
}

class Test2{
    static {
        System.out.print("OK");
    }
    public static final String a=new String("JD");
}

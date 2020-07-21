package test;
interface Constants{
    public static final int P1 = 3;
    public static final int P2 = 34;
    public static final int P3 = 35;
}
public class enumtest {
       enum Constants2{
           P1,P2,P3   //将常量放在枚举类型中
       }
       public static void doit(int c){
           switch (c){
               case Constants.P1:
                   System.out.println("用的是doit的P1");
                   break;
               case Constants.P2:
                   System.out.println("用的是doit的P2");
                   break;
               case Constants.P3:
                   System.out.println("用的是doit中的P3");
                   break;
               default:
                   System.out.println("都不是，输入的不是常量");
                   break;
           }

       }
       public static void doit2(Constants2 c){
           switch (c){
               case P1:
                   System.out.println("用的是doit2中的P1");
                   break;
               case P2:
                   System.out.println("用的是doit2中的P2");
                   break;
               case P3:
                   System.out.println("用的是doit2中的P3");
                   break;
           }
       }

    public static void main(String[] args) {
        enumtest.doit(8);
        enumtest.doit(Constants.P1);
        enumtest.doit(Constants.P3);
//        enumtest.doit2(Constants.P3);
        enumtest.doit2(Constants2.P1);
        enumtest.doit2(Constants2.P3);
    }
}

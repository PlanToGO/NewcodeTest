package test;

public class errortest {
    public static void main(String[] args) {
        try{
            String name = "风哥";
            System.out.println(name + "的年龄是");
            int age = Integer.parseInt("28L");
            System.out.println(age);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("程序还在运行....");
    }
}

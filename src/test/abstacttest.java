package test;

public class abstacttest {
    public interface remote{
        default void test(){
            System.out.println("遥控器打开了,default");
        }

        static void test1(){
            System.out.println("遥控器打开了,static");
        }
    }

    public static class remoteplay implements remote{
        int id;
        String model;

//        public remoteplay(int id,String model){
//            this.id=id;
//            this.model=model;
//        }
    }

    public static void main(String[] args) {
        remoteplay LG = new remoteplay();
        LG.test();
        remote.test1();
    }
}

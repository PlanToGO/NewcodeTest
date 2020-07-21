package test;


class student{
    int id;
    int age;
    String major;

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

public class test2 {
    public static void main(String[] args) {
        student feng = new student();
        feng.setAge(25);
        feng.setId(40);
        feng.setMajor("自动化");
        System.out.println(feng.getAge());
        System.out.println(feng.getId());
        System.out.println(feng.getMajor());
        int sum = 0;
        for (int i = 0;i < 10 ; i++){
            sum++;
        }
        System.out.println(sum);
//        System.out.println(i);
    }

}

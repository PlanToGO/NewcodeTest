package practise;

import java.io.*;

public class serial {
    public static void main(String[] args) {
        Student stu1 = new Student();
        File file = new File("/Users/eggleader/Desktop/a");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            stu1 = (Student) in.readObject();
            in.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(stu1.getId()+":"+stu1.getName());
    }
}

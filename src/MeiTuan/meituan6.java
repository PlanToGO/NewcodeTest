package MeiTuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meituan6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bf.readLine());
        String[] str = new String[len];
        int i=0;
        while (i< str.length){
            str[i]= bf.readLine();
            i++;
        }
        for (int x=0;x< str.length;x++){
            if (str[x].length()<3){
                System.out.println("Wrong");
            }else {
                boolean zimu = false;
                boolean zimushuzi = true;
                boolean leastnum = false;
                boolean leastchar = false;
                for (int j=0;j< str[x].length();j++){
                    if (j==0){
                        if (Character.isUpperCase(str[x].charAt(j))||Character.isLowerCase(str[x].charAt(j))){
                            zimu=true;
                        }
                    }
                    if (!Character.isDigit(str[x].charAt(j))&&!Character.isLetter(str[x].charAt(j))){
                        zimushuzi=false;
                    }
                    if (Character.isDigit(str[x].charAt(j))){
                        leastnum=true;
                    }
                    if (Character.isLowerCase(str[x].charAt(j))||Character.isUpperCase(str[x].charAt(j))){
                        leastchar=true;
                    }
                }
                if (zimu&&zimushuzi&&leastchar&&leastnum){
                    System.out.println("Accept");
                }else {
                    System.out.println("Wrong");
                }
            }
        }

    }
}

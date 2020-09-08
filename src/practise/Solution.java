package practise;


public class Solution {
    public enum Conta{
        Constants_A(12),
        Constants_B("changliang2");

        String description;
        int num;
        Conta(String changliang2) {
            description=changliang2;
        }

        public String getDescription() {
            return description;
        }

        public int getNum() {
            return num;
        }

        Conta(int i) {
            this.num = i;
        }
    }
    public static void main(String[] args) {
        System.out.println(Conta.values()[0].getNum());
    }
}

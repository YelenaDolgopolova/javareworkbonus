public class Main {
    public static void main(String[] args) {

        int balance1 = 2000;
        int sumReplenishment = 100;
        int bonus = 0;

        if (sumReplenishment > 1000) {
            bonus = sumReplenishment/ 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
        System.out.println(balance1 + sumReplenishment + bonus);
    }

}
public class Main {
    public static void main(String[] args) {

        int balance1 = 2000;
        int sumReplenishment = 1400;
        int bonus = 0;

        if (sumReplenishment > 1000) {
            bonus = balance1 + sumReplenishment/ 100;
        } else {
            bonus = sumReplenishment;
        }

        System.out.println(bonus);
        System.out.println(balance1 + sumReplenishment + bonus);
    }

}
public class Main {
    public static void main(String[] args) {

        int balance1 = 2000;
        int sumpopolnenia = 1300;
        int bonus = 0;

        if (sumpopolnenia > 1000) {
            bonus = balance1 + sumpopolnenia / 100;
        } else {
            bonus = sumpopolnenia;
        }

        System.out.println(bonus);
        System.out.println(balance1 + sumpopolnenia + bonus);
    }

}
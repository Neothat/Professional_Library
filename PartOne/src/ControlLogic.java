import java.math.BigInteger;
import java.util.Scanner;

public class ControlLogic {
    public static void main(String[] args) {
        int yourSales = 20;
        int target = 10;
        if (yourSales >= target) {
            String performance = "Satisfactory";
            int bonus = (int) (100 + 0.01 * (yourSales - target));
        } else {
            String performance = "Unsatisfactory";
            int bonus = 0;
        }

        if (yourSales >= 2 * target) {
            String performance = "Excellent";
            int bonus = 1000;
        } else if (yourSales >= 1.5 * target) {
            String performance = "Fine";
            int bonus = 500;
        } else if (yourSales >= target) {
            String performance = "Satisfactory";
            int bonus = 100;
        } else {
            System.out.println("You're fired");
        }

        // ===========================

        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //обновить остаток на счете, пока работник
        //не готов выйти на пенсию
        do {

            //добавить ежегодный взнос и проценты
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            //вывести текущий остаток на счету
            System.out.printf("After year %d, your balance is %, .2f % n", year, balance);

            //запросить готовность работника выйти
            //на пенсию и получить ответ
            System.out.print("Ready to retire? (Y/N) ");
            input = in.next();
        } while (input.equals("N"));

        // ===========================

        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        // ===========================

        Scanner in2 = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in2.nextInt();

        System.out.print("What is the highest number you can draw ? ");
        int n = in2.nextInt();
        /*
         * вычислить биномиальный коэффициент по формуле:
         * n*(n-l)*(n-2)* ... *(n-k+l)/(1*2*3* ... *k)
         */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in lotteryOdds" + lotteryOdds + " Good luck!");

        // ===========================

        int years = 80;
        int goal = 100000;
        while (years <= 100) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance >= goal) {
                break;
            }
            years++;
        }

        // ===========================

        for (int count = 1; count <= 100; count++) {
            System.out.print("Enter а numЬer, -1 to quit: ");
            n = in.nextInt();
            if (n < 0) continue;
            balance += n; //не выполняется, если n < О
        }

        // ===========================

        BigInteger а = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger
                ("222232244629420445529739893461909967206666939096499764990979600");
        // Обычные математические действия, такие как + или / - выполнять нельзя.
        // Нужно использовать только определенные методы

        BigInteger с = а.add(BigInteger.valueOf(100)); //с= а+ Ь
        BigInteger d = с.multiply(с.add(BigInteger.valueOf(2))).divide(BigInteger.valueOf(4)); // d = с * (Ь +

        // ===========================


    }
}
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] a = new int[100]; // Массив из 100 цифр

        int[] b; // Более правильно
        int b1[];

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        for (int i = 0; i < smallPrimes.length; i++) {
            System.out.println(smallPrimes[i]);
        }

        for (int smallPrime : smallPrimes) {
            System.out.println(smallPrime);
        }

        System.out.println(Arrays.toString(smallPrimes));

        int[] luckyNumber = smallPrimes;
        int[] copiedNumbers = Arrays.copyOf(luckyNumber, 2 * luckyNumber.length);

//        if (args[0].equals("-h")) {
//            System.out.print("Hello,");
//        } else if (args[0].equals("-g")) {
//            System.out.print("Goodbye,");
//        }
//        // вывести остальные параметры командной строки
//        for (int i = 1; i < args.length; i++) {
//            System.out.print(" " + args[i]);
//        }
//        System.out.println("!");

        Arrays.sort(copiedNumbers);
        Math.random(); // От 0 до 1 (Невкл)
        int n = 10;
        int i = (int) (Math.random() * n); // От 0 до n-1

        double [][] balances = new double[3][3];
        int[][] magic = {
                {14, 14, 15},
                {14, 14, 15},
                {14, 14, 15}
        };

        for (int j = 0; j < magic.length; j++) {
            for (int k = 0; k < magic[j].length; k++) {
                System.out.println(magic[j][k]);
            }
        }
        System.out.println(Arrays.deepToString(magic));
    }
}
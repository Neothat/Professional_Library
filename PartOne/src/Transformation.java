public class Transformation {
    public static void main(String[] args) {
        int n1 = 123456789;
        float f = n1; //значение nеременной f равно 1.234567892Е8

        double x = 9.997;
        int nx = (int) x; // 9
        int nx2 = (int) Math.round(x); // 10

        byte b1 = (byte) 300; // 44 - произошло усечение

        nx += 4; // x = x + 4
        nx *= 4; // x = x * 4
        nx %= 4; // x = x % 4

        nx++; // +1
        nx--; // -1
        ++nx; // +1
        --nx; // -1

        int m = 7;
        int n = 7;
        int a = 2 * ++m; // теперь значение а равно 16, а rn равно 8
        int b = 2 * n++; // теперь значение Ь равно 14, а n равно 8
    }
}

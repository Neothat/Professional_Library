public class LogicalRelation {
    public static void main(String[] args) {
        boolean a = 3 == 7; //false
        boolean b = 3 != 7; //true
        // <, >, <=, >=

        // && - И (Сокр сх),
        // || - ИЛИ (Сокр сх),
        // ! - НЕ

        int x = 5;
        int y = 10;
        int z = x < y ? x : y;
        // Поразрядные операции
        // & - И,
        // | - ИЛИ,
        // ^ - Искл ИЛИ
        // ~ - НЕ

        int n = 2;
        int fourthBitFromRight = (n & (1 << 3)) >> 3;
    }
}

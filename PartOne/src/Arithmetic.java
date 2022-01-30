public strictfp class Arithmetic { // strictfp - это модификатор, введенный в java 1.2, ограничивающий точность вычислений с float и double по стандарту IEEE

    public static strictfp void main(String[] args) { // strictfp - это модификатор, введенный в java 1.2, ограничивающий точность вычислений с float и double по стандарту IEEE
        int a = 15 / 2; // 7
        double b = 15.0 / 2; // 7.5
        int c = 15 % 2; // 1

        double у = Math.sqrt(4); // корень 4
        double y2 = Math.pow(2, 8); //2^8

        int a1 = (-5 % 2); // -1
        System.out.println(3 % -2); // 1
        System.out.println(Math.floorMod(3, -2)); // -1

//        Тригонометрия
//        Math.sin()
//        Math.cos()
//        Math.tan()
//        Math.atan()
//        Math.atan2()

//        Экспоненциальная и логарифмические функции
//        Math.exp()
//        Math.log()
//        Math.loglO()

//        Константы
//        Math.PI
//        Math.E
    }
}

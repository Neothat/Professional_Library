public class CharacterStrings {
    public static void main(String[] args) {
        String е = ""; // пустая строка
        String greeting = "Hello";

        String s = greeting.substring(0, 3) + "р!"; // Help

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;

        int age = 13;
        String rating = "PG" + age;

        int answer = 100;
        System.out.println("The answer is" + answer);

        String all = String.join(" / ", "S", "М", "L", "XL"); //в итоге переменная all содержит строку "S / М / L / XL"

        // Java 11+
        String repeated = "Java".repeat(3); // Повторить строку "Java", чтобы
                                            // получить в итоге строку "JavaJavaJava"

        boolean hello = "Hello!".equals(greeting);
        boolean hello2 = "Hello".equalsIgnoreCase("hello");;

        String greeting1 = "Hello"; // инициализировать переменную greeting символьной строкой "Hello"

        if (greeting == "Hello") {} // возможно, это условие истинно
        if (greeting.substring(0, 3) == "Hel") {} // возможно, это условие ложно

        int n = greeting.length(); //значение n равно 5
        int cpCount = greeting.codePointCount(0, greeting.length()); // количество кодовых точек
        char first = greeting.charAt(0); //первый символ - 'Н'
        char last = greeting.charAt(4); //последний символ - 'о'

//        Для получения i-й кодовой точки служат выражения
//        int index = greeting.offsetByCodePoints(0, i);
//        int ер= greeting.codePointAt(index);

        StringBuilder builder = new StringBuilder();
        builder.append((char) 65); // добавить единственный символ
        builder.append("str"); // добавить символьную строку
        String completedString = builder.toString();

    }
}

public class MyFirstClass {
    public static void main(String[] args) { //psvm
        System.out.println(1);// sout
        System.out.println("Hello world!");

        //примитивные

        int someValue = 11;
        System.out.println(someValue);

        double someName = 3.14;
        System.out.println(someName);

        char charValue = '\u1111';
        System.out.println(charValue);

        boolean bValue = 10 > 5;
        System.out.println(bValue);


        // Ссылочный String-строки

        String line = "Hello!!";
        String line1 = "124";

        //явное преобразование
        int x = (int) 20.6;
        System.out.println(x);

        //неявное
        byte a = 5;
        int b = a;

        String number = "125";
        int newNumber = Integer.parseInt(number);
        System.out.println(number + 1);

        int age = 20;
        String name = "Sasha";

        System.out.println(name + " " + age);

        //Ctrl + Alt + l приводит код в порядок
        // Ctrl + D копирует

        //ctrl+shift+ стрелка   перенос строки
        // Alt + вверх\вниз      печать на нескольких строках

        //Логические операторы && - И
        if (10 > 3 && 2 == 2) {
            System.out.println("10 больше 3");
        }

        //Логические операторы || - ИЛИ
        if (10 > 3 || 2 == 3) {
            System.out.println("10 больше 3");
        }

        // Операторы присваения
        int num = 15;
        num+=10;
        System.out.println(num); // выведет 25

        // тернарный (условие)?Если true: Eсли fauls;
        System.out.println(10>4 ? "yes" : "no");





    }
}






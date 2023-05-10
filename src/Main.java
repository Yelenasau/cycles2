public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month = month + 1;
            total = total + 15000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");

        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int positiveRate = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            people += people / 1000 * positiveRate;
            System.out.println("Год " + i + " численность населения составляет " + people);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        var pro = 0.07;
        int i = 1;
        for (; salary < 12_000_000; i++) {
            salary += salary * pro;
            System.out.println("Месяц " + i + " Итого " + salary);
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        var pro = 0.07;
        int i = 1;
        for (; salary < 12_000_000; i++) {
            salary += salary * pro;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " Итого " + salary);
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        var pro = 0.07;
        int i = 1;
        for (; i <= 108; i++) {
            salary += salary * pro;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " Итого " + salary);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 5;
        for (; i <= 31; i = i + 7) {
            System.out.println("Cегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int futur = year + 100;
        int past = year - 200;
        for (int i = 0; i < futur; i += 79)
        if (i > past){
            System.out.println(i);
        }
    }
}
import java.time.LocalDate;

public class Main {
    public static void printInfoAboutYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println(y + " год - високосный год");
        } else {
            System.out.println(y + " год - невисокосный год");
        }
    }

    public static void printInfoAboutVersion(int x, int z) {
        int currentYear = LocalDate.now().getYear();
        if (z == 0) {
            if (x < currentYear) {
                System.out.println("Установите облегченную версию для Айфона");
            } else {
                System.out.println("Установите текущую версию для Айфона");
            }
        } else {
            if (x < currentYear) {
                System.out.println("Установите облегченную версию для Андроид");
            } else {
                System.out.println("Установите текущую версию для Андроид");
            }
        }
    }

    public static int printInfoAboutDelivery (int distance) {
        int days = 0;
        if (distance < 20) {
            days++;
            return days;
        } else if (distance < 60) {
            days += 2;
            return days;
        } else if (distance <= 100) {
            days += 3;
            return days;
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int year = 2008;
        printInfoAboutYear(year);
    }

    public static void task2() {
        System.out.println("Задача № 2");
        int yearOfPhone = 2019;
        int versionOfPhone = 1;
        printInfoAboutVersion(yearOfPhone, versionOfPhone);
    }

    public static void task3() {
        System.out.println("Задача №3");
        int distance = 35;
        int d = printInfoAboutDelivery(distance);
        if (d == 0) {
            System.out.println("Доставки нет");

        } else {
            System.out.println("Доставка займет дней: " + d);

        }
    }
}






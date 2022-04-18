package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSum(50, 16));
        positiveInt(0);
        System.out.println();
        System.out.println(isNegative(5));
        printWordNTimes("Превед медвед", 10);
        System.out.println(isLeapYear(2024));
    }
    public static boolean checkSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        }
        else return false;
    }
    public static void positiveInt (int a) {
        if (a <0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.printf("Число положительное");
        }
    }
    public static boolean isNegative (int a) {
        if (a < 0) {
            return true;
        }
        else return false;
    }
    public static void printWordNTimes (String word, int times) {
        int i;
        for (i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear (int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))  {
           return false;
        }
        else {
            return true;
        }

    }
}

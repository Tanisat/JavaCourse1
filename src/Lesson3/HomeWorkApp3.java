package Lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        transformArray();
        System.out.println();
        tooHundred();
        System.out.println();
        arrMultiplyLessSix();
        System.out.println();
        fillArray();
        returnArray(7,777);
    }


    public static void transformArray () {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
            System.out.print(array[i]);
        }
    }

    public static void tooHundred () {
        int[] arrToHundred = new int[100];
        for (int i = 0; i < arrToHundred.length; i++) {
            arrToHundred[i] = i + 1;
            System.out.print(arrToHundred[i] + " ");
        }
    }
    public static void arrMultiplyLessSix () {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void fillArray () {
        int [][] array = {
                {14, 15, 7},
                {26, 22, 64},
                {88, 20, 35}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void returnArray (int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.println("Элемент массива " + i + " Содержимое " + array[i] + " ");
        }
    }

}

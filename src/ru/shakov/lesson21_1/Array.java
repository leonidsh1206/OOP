package ru.shakov.lesson21_1;

public class Array {
    public static void main(String[] args) {
        // Задаем двухмерный массив
        int[][] m = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        // Вызываем метод для вывода массива в консоль
        showArray(m);

        System.out.println("----------------------------------------");

        //Вызываем метод для смещения всех элементов "столбцов" на один влево,
        // освободившемуся крайнему "правому" элементу присваиваем 0
        moveArrayElements(m);
        // Вызываем метод для вывода массива в консоль
        showArray(m);
    }

    // Метод, который будет смещать элементы "столбцов" на один влево
    // крайнему "правому" элементу будет присвоен 0
    private static void moveArrayElements(int[][] m) {
        for (int t = 0; t < m.length; t++) {
            for (int q = 0; q < m[t].length; q++) {
                if (q < m[t].length - 1) {
                    m[t][q] = m[t][q + 1];
                } else {
                    m[t][q] = 0;
                }
            }
        }
    }

    // Метод, который будет выводить элементы массива в консоль
    private static void showArray(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.printf("[%d] ", anInt);
            }
            System.out.println();
        }
    }
}

package org.example;

public class Task2 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {90, 50, 80};
        int[] arr3 = {5, 6};

        int[] res = diff(arr1,arr2);
        for (int element: res)
            System.out.print(element + " ");
        System.out.println();

        res = diff(arr2,arr1);
        for (int element: res)
            System.out.print(element + " ");
        System.out.println();

        res = diff(arr1, arr3);

    }
    public static int[] diff(int []a, int []b){
        if (a == null || b == null)
            throw new RuntimeException("Должны быть заданы оба массива");
        if (a.length != b.length)
            throw new RuntimeException("Оба массива должны быть одной длины!");
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}

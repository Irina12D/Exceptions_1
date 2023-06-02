package org.example;

public class Task3 {

    // Дополнительно * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 16};
        int[] arr2 = {3, 2, 8};
        int[] arr3 = {90, 50, 14, 77};
        int[] arr4 = {3, 0, 7, 11};

        int[] res = division(arr1,arr2);
        for (int element: res)
            System.out.print(element + " ");
        System.out.println();

        res = division(arr1,arr3);

        res = division(arr3, arr4);

    }

    public static int[] division(int []a, int []b){
        if (a == null || b == null)
            throw new RuntimeException("Должны быть заданы оба массива");
        if (a.length != b.length)
            throw new RuntimeException("Оба массива должны быть одной длины!");
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("Ошибка! Деление на ноль в "+ (i+1) + "-й ячейке массива");
            c[i] = a[i] - b[i];
        }
        return c;
    }

}

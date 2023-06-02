package org.example;

public class Task1 {

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {

        // Метод 1
        /*
        roots(2, 7, -13);
        roots(2, 7, 13);
        roots(0, 7, -3);
        */

        // Метод 2
        /*
        String [] pass = {"QwertY",  "qwerty" , ""};
        for (String test: pass)
            if (checkPassword(test))
                System.out.println("Добро пожаловать в систему");
            else
                System.out.println("Пароль неверен");
         */

        // Метод 3
        int []d1 = {3, -4, 5, 7, 12};
        int []d2 = {3, 4, -5, -7, -12};
        System.out.println(checksum(d1));
        System.out.println(checksum(d2));
    }


    // метод, вычисляющий корни квадратного уравнения
    // исключение - коэффициент при квадрате равен 0
    // метод будет сразу сам выводить ответ
    public static void roots(int a, int b, int c){
        if (a == 0)
            throw new RuntimeException("Коэффициент при квадрате не должен равняться нулю");
        int D = b*b - 4*a*c;
        if(D < 0){
            System.out.println("x1 = (" + -b + " + " + Math.sqrt(Math.abs(D))+ "i) / " + 2*a);
            System.out.println("x2 = (" + -b + " - " + Math.sqrt(Math.abs(D))+ "i) / " + 2*a);
        }
        else if(D > 0){
                System.out.println("x1 = " + (-b + Math.sqrt(D) )/ (2*a));
                System.out.println("x2 = " + (-b - Math.sqrt(D) )/ (2*a));
            }
        else System.out.println("x1 = x2 = " + -b / (2*a));
    }

    // метод проверки пароля
    // допустим метод знает верный пароль validPassword
    // (притворимся, что он достал его из базы)
    // исключение - не введён пароль
    public static boolean checkPassword(String password){
        String validPassword = "QwertY";
        if(password.isEmpty())
            throw new RuntimeException("Необходимо ввести пароль");
        if (password.equals(validPassword))
            return true;
        return false;
    }

    // метод вычисления некой контрольной суммы для проверки правильности данных
    // типа хэша, но ооочень примитивного, т.к. просто суммируем набор целых чисел
    // и если сумма вдруг откажется орицательной, то значит с данными что-то не то

    public static int checksum(int []data){
        int sum = 0;
        for(int i=0; i < data.length; i++)
            sum += data[i];
        if (sum < 0)
            throw new RuntimeException("контроль не пройден");
        return sum;
    }

}

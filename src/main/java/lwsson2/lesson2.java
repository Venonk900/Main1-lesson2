package lwsson2;
/*
public class lesson2 {
    public static void main(String[] args) {
        numberWork(1);
        System.out.println(checkIfSumInRange(9, 19));
        numberWork(2);
        System.out.println(greater_than_or_less_than_zero(6));
        numberWork(3);
        System.out.println(true_or_false(5));
        numberWork(4);
        print_word("Hello John", 10);
        numberWork(5);
        year_bad_or_nice(2077);


    }

    public static void numberWork(int a) {
        System.out.println("Задание № " + a);
    }

    /**
     * 1 Написать метод, принимающий на вход два целых числа и проверяющий, что их
     * //    сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
     * противном случае – false.
     **/
    /**
     *
     * @param a
     * @param b
     * @return
     */
   /* public static boolean checkIfSumInRange(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20){
            return true;
        }
            else return false;
    }

    /**
     * 2  Написать метод, которому в качестве параметра передается целое число, метод
     * //   должен напечатать в консоль, положительное ли число передали или отрицательное.
     * //   Замечание: ноль считаем положительным числом.
     **/
    /**
     *
     * @param a
     * @return
     */
  /*  public static int greater_than_or_less_than_zero(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
        return a;
    }

    /**
     * 3 Написать метод, которому в качестве параметра передается целое число. Метод
     * //  должен вернуть true, если число отрицательное, и вернуть false если положительное.
     **/
    /**
     *
     * @param a
     * @return
     */
/*    public static boolean true_or_false(int a) {
        if (a < 0){
            return true;
            return false;
    }

    /**
     * 4 Написать метод, которому в качестве аргументов передается строка и число, метод
     * //  должен отпечатать в консоль указанную строку, указанное количество раз
     **/
    /**
     *
     * @param word
     * @param times
     */
 /*   public static void print_word(String words, int times) {
        for (int i = 0; i < times; i++)
            System.out.println(words);

    }

    /**
     * 5 * Написать метод, который определяет, является ли год високосным, и возвращает
     * //    boolean (високосный - true, не високосный - false). Каждый 4-й год является
     * //    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     **/
    /**
     *
     * @param year
     * @return
     */
   /* public static boolean year_bad_or_nice(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
            return true;
        } else {
            System.out.println(year + " г. високосный");
            return false;
        }


    }
}

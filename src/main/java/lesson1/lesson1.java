package lesson1;

public class lesson1 {
    public static void main(String[] args) {

        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
    }

    public static void printThreeWords() {


        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {


        int a = 1;
        int b = 2;
        int sum = a + b;

        if (sum >= 0) {

            System.out.println("Сумма положительная");
        } else {

            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {

        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }


    public static void СompareNumbers () {
        int a = 210;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}

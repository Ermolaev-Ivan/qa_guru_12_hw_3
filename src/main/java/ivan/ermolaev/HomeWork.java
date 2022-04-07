package ivan.ermolaev;

import java.lang.reflect.Array;

public class HomeWork {
    public static void main(String[] args) {
        char symbol = 'w';

        boolean flag = false;

        byte aByte= 15;                 // -128 ... 127                                                 // 1 byte
        short aShort= 31000;               // -32768 ... 32767                                             // 2 byte
        int aInt= 83648;                   // -2147483648 ... 2147483647                                   // 4 byte
        long aLong= 11147483648L;                 // –9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807     // 8 byte
        float aFloat= 1.123F;               // 4 byte
        double aDouble= 12.23;             // 8 byte


        String hello = "Hello";
        String java = "Java";

        String [] arrayString = new String[2];
        arrayString[0] = hello;
        arrayString[1] = java;

        System.out.println("Сумма аргументов переданых в функцию sum = "+ sum(aFloat,aDouble));
        System.out.println("Разность аргументов переданых в функцию difference = "+ difference(aInt,aShort));
        System.out.println("Произведение аргументов переданых в функцию multiplication = "+ multiplication(aByte,aInt));
        System.out.println("Частное аргументов переданых в функцию division = "+ division((int) aLong,5));
        System.out.println("Остаток деления от аргументов переданых в функцию modulo = "+ modulo((short)aInt,aShort));

        printArray(arrayString);
        concatenation(hello, java);
    }

    static void printArray(String[] arr){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    static void concatenation(String first, String second){
        System.out.println(first + " " + second + "!");
    }

    static double sum(double first, double second) {return first + second;}
    static int difference(int first, int second) {return   first - second;}
    static int multiplication(int first, int second) {return   first * second;}
    static int division(int first, int second) {return   first / second;}
    static int modulo(int first, int second) {return   first % second;}
}

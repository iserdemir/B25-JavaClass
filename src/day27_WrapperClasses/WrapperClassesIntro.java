package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 100;
        Integer n1 = num1;//autoboxing

        int num2 = num1; //unboxing

        System.out.println("*****************");

        Integer integerValue = 100;
        long longValue = integerValue;

        Byte b1 = 24;
        byte a1 =b1;
        short a2 =b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("******************");

        int num3 = 200;
        Integer n2 = num3;//autoboxing

        System.out.println("******************");
        int [] numbers = {1,2,23,4};
        Integer [] numbers1 = {1,2,3,5};


    }
}

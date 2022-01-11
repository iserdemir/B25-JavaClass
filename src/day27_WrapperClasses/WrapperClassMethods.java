package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int a =Integer.parseInt(str);
        System.out.println(a*2);

        String x ="10.7";
        double b =Double.parseDouble(x);
        System.out.println(b*2);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        String s1 = "maybe";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("****************");
        String s2 = "123";
        Integer num12 = Integer.valueOf(s2);
        System.out.println(num12*2);
        String s3 = "1.5";
        Double z = Double.valueOf(s3);
        System.out.println("***********");

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);
        boolean r4 = Character.isSpaceChar(ch1);
        boolean r5 = Character.isUpperCase(ch1);
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println("4: " + r4 + "5: " + r5 + "6: " +r6 );
        System.out.println("****************");
        String i = "ab1c2ef3g5hi4";
        int sum =0;
for (char each : str.toCharArray()){
    if (Character.isDigit(each)){
        sum+=Integer.parseInt(""+each);
    }
}
        System.out.println(sum);
    }
}

package day40_FinalKeyword;

public class FinalVariable {
    final String birthday;
    final static String name;

    static {
        name = "Batch 25";
    }
    public FinalVariable(String birthday){
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        final double pi = 3.14;
        final String name;
        name = "Java";
        System.out.println("-----------------");
        FinalVariable obj = new FinalVariable("March/25");
        //obj.birthday = "June/01"; final variable can not be reassigned
        System.out.println(obj.birthday);
        System.out.println("-------------------");
        //FinalVariable.name = "Phyton";
        System.out.println(FinalVariable.name);
    }
}

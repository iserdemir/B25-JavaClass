package day40_FinalKeyword.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(d.getBreed());
        System.out.println(d.getGender());
        d.drink();
    }
}

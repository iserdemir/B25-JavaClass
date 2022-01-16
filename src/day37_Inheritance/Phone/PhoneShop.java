package day37_Inheritance.Phone;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone i = new Iphone("13 pro" , "Big Screen", 1250.50,"Navy");
        i.faceTime(8574520429l);
        Samsung s = new Samsung("Galaxy 20", "Middle Screen", 850, "White");
        s.play("NBA2K22");
    }
}

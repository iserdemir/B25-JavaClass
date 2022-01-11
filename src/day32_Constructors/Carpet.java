package day32_Constructors;

public class Carpet {
    public double unitPrice,width,length;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width = " + width +
                ", length = " + length +
                ", unitPrice = $" + unitPrice +
                ", isPersian = " + isPersian +
                ", Total price: $" + calcCost()+
                '}';
    }
}

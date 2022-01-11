package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer("MA", "Boston Dynamics", "QA Tester", 150000, true, true, true, true);
        System.out.println(offer1);
        Offer offer2 = new Offer("NC", "IBM", "Automation Tester", 120000, true,true,true, true);
        System.out.println(offer2);
        Offer offer3 = new Offer("MO", "Mastercard", "Automation Tester", 90000, true,true,true, false);
        System.out.println(offer3);
        Offer offer4 = new Offer("IL", "Bulls", "Automation Tester", 80000, true,true,true, false);
        System.out.println(offer4);
        Offer offer5 = new Offer("CA", "Apple", "Automation Tester", 120000, true,true,true, true);
        System.out.println(offer5);
        System.out.println("*****************");
        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);
        for (Offer fullTimeOffer : fullTimeOffers) {
            System.out.println(fullTimeOffer);

        }
        for (Offer myOffer : myOffers) {
            System.out.println(myOffer.companyName+ " : $"+myOffer.salary);

        }
    }
}

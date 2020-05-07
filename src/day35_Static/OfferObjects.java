package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("FL","BOFA",100000,false);

        //System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("CA","Capital One",150000,true);

       // System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("NY","Discover",200000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("GA","Chase ",90000,false);

        String myLocation ="NY";

        Offer[] offers ={offer1,offer2,offer3,offer4};
        ArrayList<Offer>Accept = new ArrayList<>(Arrays.asList(offers));
  //  Accept.removeIf(p->p.salary<100000 || p.isFullTime==false|| !p.location.equals(myLocation));// we remove the offer it's less than 100k time and if fulltime is false
//Accept.removeIf(p-> !p.isFullTime);
Accept.removeIf(p->p.salary<100000);
Accept.removeIf(p->p.isFullTime==false);
Accept.removeIf(p-> !p.location.equals(myLocation));


        System.out.println(Accept.size());
    for (Offer eachOffer : Accept){
        System.out.println(eachOffer);
    }

    }
}

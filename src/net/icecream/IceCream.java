package net.icecream;

public class IceCream {
    String flavor;
    int scoops = 0;

    void addScoop() {
        scoops = scoops + 1;
        System.out.println("Scoops +1");
    }
    void eatScoop() {
        scoops = scoops - 1;
        System.out.println("Scoops -1");
    }
    void setVanilla() {
        flavor = "Vanilla";
        System.out.println("Your flavor is now vanilla");
    }
    void setStrawberry() {
        flavor = "Strawberry";
        System.out.println("Your flavor is now strawberry");
    }
    void iceCreamInfo() {
        System.out.println("You have " + scoops + " scoops.");
        System.out.println("Your flavor is " + flavor);
    }
}

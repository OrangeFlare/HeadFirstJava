package net.icecream;

public class IceCream {
    private String flavor;
    private int scoops = 0;

    public void addScoop(int amount) {
        scoops = scoops + amount;
        System.out.println("Scoops +" + amount);
    }
    public void eatScoop(int amount) {
        scoops = scoops - amount;
        System.out.println("Scoops -" + amount);
    }
    public void setVanilla() {
        flavor = "Vanilla";
        System.out.println("Your flavor is now vanilla");
    }
    public void setStrawberry() {
        flavor = "Strawberry";
        System.out.println("Your flavor is now strawberry");
    }
    public void iceCreamInfo() {
        System.out.println("You have " + scoops + " scoops.");
        System.out.println("Your flavor is " + flavor);
    }
}

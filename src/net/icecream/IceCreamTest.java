package net.icecream;

public class IceCreamTest {
    public static void main (String[] args) {
        IceCream IC1 = new IceCream();
        IceCream IC2 = new IceCream();
        IC1.addScoop();
        IC1.addScoop();
        IC1.setStrawberry();
        IC2.addScoop();
        IC2.addScoop();
        IC2.addScoop();
        IC2.addScoop();
        IC2.setVanilla();
        IC1.iceCreamInfo();
        IC2.iceCreamInfo();
    }
}

package net.icecream;

public class IceCreamTest {
    public static void main (String[] args) {
        /*
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
        */
        IceCream[] cones = new IceCream[2];
        cones[0] = new IceCream();
        cones[1] = new IceCream();
        cones[0].addScoop(1);
        cones[1].addScoop(2);
        cones[0].setStrawberry();
        cones[1].setVanilla();
        cones[1].eatScoop(1);
        cones[0].iceCreamInfo();
        cones[1].iceCreamInfo();
    }
}

package SOLID.L;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Sparrow1());
        birds.add(new Ostrich1());

        for (Bird bird : birds) {
            bird.noOfLegs();
        }
    }
}

class Bird {
    public void noOfLegs() {
        System.out.println("2");
    }
}

class Sparrow1 extends Bird{
    public void fly() {
        System.out.println("Sparrow is Flying..");
    }
}

class Ostrich1 extends Bird{
    public void habitate() {
        System.out.println("Ostriches are majorly found in Australia");
    }
}

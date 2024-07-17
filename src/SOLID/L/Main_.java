package SOLID.L;

import java.util.ArrayList;
import java.util.List;

/**
 * Issue
 * An Ostrich cannot fly, so calling fly() on an Ostrich instance would result in an exception, violating LSP.
 */
class Bird_ {
    public void fly(){
        System.out.println("Bird is flying");
    }
}

class Sparrow extends  Bird_{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying..");
    }
}

class Ostrich extends  Bird_{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}

public class Main_ {
    public static void main(String[] args) {
        List<Bird_> bird_s = new ArrayList<>();
        bird_s.add(new Sparrow());
        bird_s.add(new Ostrich());

        for (Bird_ bird_ : bird_s) {
            bird_.fly();
        }
    }
}


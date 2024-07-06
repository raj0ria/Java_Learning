package JavaClasses.concrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classes for which we can create an instance
 * All the methods should have implementation.
 * Only for concrete classes you can create an object.
 */
public class MyConcreteClass {
    int id;
    String name;

    public MyConcreteClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List getDetails(){
        return new ArrayList<>(Arrays.asList(id, name));
    }


}

class Main{
    public static void main(String[] args) {
        MyConcreteClass myConcreteClass = new MyConcreteClass(1, "Ashish Sharma");
        System.out.println(myConcreteClass.getDetails());
    }
}
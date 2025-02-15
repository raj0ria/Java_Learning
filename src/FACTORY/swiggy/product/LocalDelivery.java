package FACTORY.swiggy.product;

public class LocalDelivery implements Delivery{

    @Override
    public void deliver(){
        System.out.println("Local restaurant delivery coming...");
    }
}

package FACTORY.swiggy.product;

public class CloudDelivery implements Delivery{

    @Override
    public void deliver() {
        System.out.println("Cloud kitchen delivery loading...");
    }
}

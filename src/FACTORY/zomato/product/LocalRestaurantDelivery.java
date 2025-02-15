package FACTORY.zomato.product;

public class LocalRestaurantDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Local restaurant Delivery");
    }
}

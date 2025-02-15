package FACTORY.zomato.factory;

import FACTORY.zomato.product.Delivery;
import FACTORY.zomato.product.LocalRestaurantDelivery;

public class LocalRestaurantFactory implements DeliveryFactory{

    @Override
    public Delivery createDelivery() {
        return new LocalRestaurantDelivery();
    }
}

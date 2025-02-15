package FACTORY.swiggy.factory;

import FACTORY.swiggy.product.Delivery;
import FACTORY.swiggy.product.LocalDelivery;

public class LocalDeliveryFactory implements DeliveryFactory{

    @Override
    public Delivery createDelivery() {
        return new LocalDelivery();
    }
}

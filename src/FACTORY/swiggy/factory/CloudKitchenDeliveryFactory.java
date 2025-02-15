package FACTORY.swiggy.factory;

import FACTORY.swiggy.product.CloudDelivery;
import FACTORY.swiggy.product.Delivery;

public class CloudKitchenDeliveryFactory implements DeliveryFactory{


    @Override
    public Delivery createDelivery() {
        return new CloudDelivery();
    }
}

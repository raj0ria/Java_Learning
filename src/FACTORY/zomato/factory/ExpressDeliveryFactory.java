package FACTORY.zomato.factory;

import FACTORY.zomato.product.Delivery;
import FACTORY.zomato.product.ExpressDelivery;

public class ExpressDeliveryFactory implements DeliveryFactory{

    @Override
    public Delivery createDelivery() {
        return new ExpressDelivery();
    }
}

package FACTORY.zomato.service;

import FACTORY.zomato.factory.DeliveryFactory;
import FACTORY.zomato.product.Delivery;

public class DeliveryService {

    DeliveryFactory deliveryFactory;

    public DeliveryService(DeliveryFactory deliveryFactory) {
        this.deliveryFactory = deliveryFactory;
    }

    public void deliver() {
        Delivery delivery = deliveryFactory.createDelivery();
        delivery.deliver();
    }
}

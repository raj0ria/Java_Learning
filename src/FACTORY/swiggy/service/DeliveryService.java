package FACTORY.swiggy.service;

import FACTORY.swiggy.factory.DeliveryFactory;
import FACTORY.swiggy.product.Delivery;

public class DeliveryService {
    DeliveryFactory deliveryFactory;

    public DeliveryService(DeliveryFactory deliveryFactory) {
        this.deliveryFactory = deliveryFactory;
    }

    public void delivery() {
        Delivery delivery = deliveryFactory.createDelivery();
        delivery.deliver();
    }
}

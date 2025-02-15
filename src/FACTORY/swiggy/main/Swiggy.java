package FACTORY.swiggy.main;

import FACTORY.swiggy.factory.DeliveryFactory;
import FACTORY.swiggy.factory.LocalDeliveryFactory;
import FACTORY.swiggy.product.Delivery;
import FACTORY.swiggy.service.DeliveryService;


public class Swiggy {
    public static void main(String[] args) {
        DeliveryFactory factory = new LocalDeliveryFactory();
        DeliveryService service = new DeliveryService(factory);

        service.delivery();
    }
}

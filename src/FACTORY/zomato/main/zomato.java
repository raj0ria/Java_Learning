package FACTORY.zomato.main;

import FACTORY.zomato.factory.DeliveryFactory;
import FACTORY.zomato.factory.ExpressDeliveryFactory;
import FACTORY.zomato.factory.LocalRestaurantFactory;
import FACTORY.zomato.product.Delivery;
import FACTORY.zomato.product.LocalRestaurantDelivery;
import FACTORY.zomato.service.DeliveryService;

public class zomato {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = new ExpressDeliveryFactory();

        DeliveryService service = new DeliveryService(deliveryFactory);


    }
}

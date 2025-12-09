/* 
write a porgram to implement abstract class using the class name of " Delivery "; based on ecomerce website
try to have seperate classes [one for standard delivery and one for express delivery] that extends the abstract class "Delivery",
use business logic to charge 10% extra for express delivery 
example
rs. 100 for standard delivery and rs. 110 for express delivery
*/

abstract class Delivery {
    protected double basePrice;

    public Delivery(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculateDeliveryCharge();
}
class StandardDelivery extends Delivery {

    public StandardDelivery(double basePrice) {
        super(basePrice);
    }

    @Override
    public double calculateDeliveryCharge() {
        System.out.println("Standard Delivery Charge: " + basePrice);
        return basePrice;
    }
}
class ExpressDelivery extends Delivery {

    public ExpressDelivery(double basePrice) {
        super(basePrice);
    }

    @Override
    public double calculateDeliveryCharge() {
        System.out.println("Express Delivery Charge: " + (basePrice * 0.10 + basePrice));
        return basePrice * 0.10 + basePrice; 
    }
}
public class DeliverySystem {
    public static void main(String[] args) {
        Delivery d1 = new StandardDelivery(500.00);
        d1.calculateDeliveryCharge();

        System.out.println();

        Delivery d2 = new ExpressDelivery(300.00);
        d2.calculateDeliveryCharge();
    }
}
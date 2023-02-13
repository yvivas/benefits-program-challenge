package coe.unosquare.benefits.order;

import coe.unosquare.benefits.product.Product;

import java.util.Map;

/**
 * Abstract Class focused in the payment's order process.
 */
public abstract class Payment extends Order {


    /**
     * Instantiates a new Payment Order.
     *
     * @param productsMap the list of products added to the order
     */
    public Payment(Map<Product, Integer> productsMap) {
            super(productsMap);
    }

    /**
     * Pay double.
     *
     * @param products, list of purchased items
     * @param discount value of discount to be applied
     * @return the amount paid (double)
     */
    public static Double pay(Map<Product, Integer>  products, Double discount ){
        double subtotal = products.entrySet()
                .stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue())
                .sum();
        return subtotal - subtotal * discount;
    };

/**
 * getDiscount abstract double.
 *
 * @param products, list of purchased items
 * @return discount obtained for the order based in the franchise
 */
    public abstract Double getDiscount(Map<Product, Integer>  products);
}

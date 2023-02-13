package coe.unosquare.benefits.order;

import coe.unosquare.benefits.product.Product;

import java.util.Map;

/**
 * Order to be paid with Visa franchise.
 */
public class PayVisa extends Payment {

    /**
     * Instantiates a new Order.
     *
     * @param productsMap the list of products added to the order
     */
    public PayVisa(Map<Product, Integer> productsMap) {
        super(productsMap);
    }

    /**
     * getDiscount double.
     *
     * @param products, list of purchased items
     * @return discount obtained for the order for the Visa franchise
     */
    public  Double getDiscount(Map<Product, Integer>  products) {
        Double discount;
        if (products.values()
                .stream()
                .reduce(0, (totalProductCount, quantity) -> totalProductCount += quantity) >= 10) {
            discount = 0.15;
        } else if (products.values()
                .stream()
                .reduce(0, (totalProductCount, quantity) -> totalProductCount += quantity) >= 7) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }
        return discount;
    }
}

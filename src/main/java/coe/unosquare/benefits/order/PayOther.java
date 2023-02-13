package coe.unosquare.benefits.order;

import coe.unosquare.benefits.product.Product;

import java.util.Map;

/**
 * Order to be paid if there is no known franchise.
 */
public class PayOther extends Payment{

    private static Double DEFAULT_DISCOUNT = 0.0;

    /**
     * Instantiates a new Pay Order without a known franchise.
     *
     * @param productsMap the list of products added to the order
     */
    public PayOther(Map<Product, Integer> productsMap) {
        super(productsMap);
    }


    /**
     * Gets the default discount.
     *
     * @param products the list of products added to the order
     */
    @Override
    public Double getDiscount(Map<Product, Integer> products) {
        return DEFAULT_DISCOUNT;
    }
}

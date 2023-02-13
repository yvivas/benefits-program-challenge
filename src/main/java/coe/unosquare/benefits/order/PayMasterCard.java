package coe.unosquare.benefits.order;

import coe.unosquare.benefits.product.Product;

import java.util.Map;

/**
 * Order to be paid with MasterCard franchise.
 */
public class PayMasterCard extends Payment{

    /**
     * Instantiates a new Order.
     *
     * @param productsMap the list of products added to the order
     */
    public PayMasterCard(Map<Product, Integer> productsMap) {
        super(productsMap);
    }

    /**
     * getDiscount double.
     *
     * @param products, list of purchased items
     * @return discount obtained for the order for the Master Card franchise
     */
    @Override
    public  Double getDiscount(Map<Product, Integer> products) {
        Double discount;
        if (products.entrySet()
                .stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue())
                .sum() >= 100) {
            discount = 0.17;
        } else if (products.entrySet().stream()
                .mapToDouble(product -> product.getKey().getPrice() * product.getValue())
                .sum() >= 75) {
            discount = 0.12;
        } else {
            discount = 0.08;
        }
        return discount;
    }
}

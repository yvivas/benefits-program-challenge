/*
 *  PayOrderSimulator
 *  1.0
 *  11/8/22, 8:29 PM
 *  Copyright (c) 2022 Unosquare
 *  Any illegal reproduction of this content will result in immediate legal action.
 */

package coe.unosquare.benefits.util;

import coe.unosquare.benefits.exceptions.HappyFeetNoProductsException;
import coe.unosquare.benefits.order.Order;
import coe.unosquare.benefits.order.PayMasterCard;
import coe.unosquare.benefits.order.PayOther;
import coe.unosquare.benefits.order.PayVisa;
import coe.unosquare.benefits.product.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/**
 * The type Pay order simulator.
 */
public final class PayOrderSimulator {
    /**
     * Hide constructor to avoid instances of this utility class.
     */
    private PayOrderSimulator() { }

    /**
     * Method to simulate the process of an order being paid.
     *
     * @param products    the products
     * @param paymentType the payment type
     * @return the double
     */
    public static Double payOrder(final Map<Product, Integer> products, final String paymentType) {
        if(products == null || products.isEmpty()){
            throw new HappyFeetNoProductsException("You should have purchased products in order to pay");
        }
        Order order = new Order(products);
        Double discount = 0.0;
        switch (paymentType){
            case "Visa":
                PayVisa payVisa = new PayVisa(products);
                discount = payVisa.getDiscount(products);
                break;
            case "Mastercard":
                PayMasterCard paymasterCard = new PayMasterCard(products);
                discount = paymasterCard.getDiscount(products);
                break;
            default :
                PayOther payOther = new PayOther(products);
                discount = payOther.getDiscount(products);
                break;
        }
        Double subtotal = products.entrySet()
                            .stream()
                            .mapToDouble(product -> product.getKey().getPrice() * product.getValue())
                            .sum();
        return new BigDecimal((subtotal - order.pay(discount)) / subtotal)
                .setScale(2, RoundingMode.HALF_EVEN)
                .doubleValue();
    }
}


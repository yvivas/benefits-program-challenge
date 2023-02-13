package coe.unosquare.benefits.exceptions;

/**
 * HappyFeetNoProductsException Validates that at least there are products to be processed.
 *
 * @param message detail info about the exception
 */
public class HappyFeetNoProductsException extends RuntimeException{
    public HappyFeetNoProductsException(String message) {
        super(message);
    }
}

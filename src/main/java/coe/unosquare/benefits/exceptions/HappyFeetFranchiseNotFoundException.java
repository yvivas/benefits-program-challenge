package coe.unosquare.benefits.exceptions;

/**
 * HappyFeetFranchiseNotFoundException verify that a know franchise is being processed.
 *
 * @param message detail info about the exception
 */
public class HappyFeetFranchiseNotFoundException extends RuntimeException{
    public HappyFeetFranchiseNotFoundException(String message) {
        super(message);
    }
}

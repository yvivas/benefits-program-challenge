package coe.unosquare.benefits.product;

/**
 * The type Product.
 */
public class Product {
    /** The Product name. **/
    private String name;
    /** The Product price. **/
    private Double price;
    /** The Product type defined by: 1 = Basic need, 2 =  Work tool, 3 = Luxury.  **/
    private Integer type;

    /**
     * Instantiates a new Product.
     *
     * @param name  the name
     * @param price the price
     * @param type  the type
     */
    public Product(final String name, final Double price, final Integer type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(final Double price) {
        this.price = price;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(final Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{"
                + "name='" + name + '\''
                + ", price=" + price
                + ", type=" + type + '}';
    }
}

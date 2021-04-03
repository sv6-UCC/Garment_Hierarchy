/**
 * Class for Fabric with methods to find the name,
 * price per unit and environment tax of the fabric.
 * @author Sean Vaughan (ID 119361923)
 */
public class Fabric {
    private String name;
    private final Double PRICE_PER_UNIT = 0.0;
    private Double price_per_unit;
    private final Double ENVIRONMENT_TAX = 0.0;
    private Double environment_tax;

    /**
     * Construct an instance of this class with a given name
     *
     * @param name The name of the garment.
     */

    public Fabric(final String name){
        this.name=name;
        price_per_unit=PRICE_PER_UNIT;
        environment_tax =ENVIRONMENT_TAX;
    }

    /**
     * Get the name of this fabric.
     *
     * @return The name of this fabric.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Price per unit of fabric
     *
     * @return The price per unit of fabric.
     */
    public Double Price_per_unit() {
        return price_per_unit;
    }

    /**
     * Gets the environment tax of fabric
     *
     * @return The environment tax of fabric.
     */
    public Double getEnvironment_tax() {
        return environment_tax;
    }

    /**
     * The string method for the fabric which is the name of the fabric
     *
     * @return The name of the fabric
     */
    @Override
    public String toString( ) {
        return getName();
    }
}

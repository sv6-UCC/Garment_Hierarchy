/**
 * Class for Acrylic with its specific price per unit (6.0)
 *
 * @author Sean Vaughan (ID 119361923)
 */
public final class Acrylic extends Synthetic_Fabric{
    private static final String NAME = "acrylic";
    private static final Double PRICE_PER_UNIT = 6.0;
    private Double price_per_unit;

    /**
     * Construct an instance of this class with it's name (acrylic) to be used in the super class Synthetic_Fabric.
     */
    public Acrylic(){
        super(NAME);
        price_per_unit=PRICE_PER_UNIT;
    }

    /**
     * Get the price per unit of Acrylic
     *
     * @return The price per unit of Acrylic
     */
    @Override
    public Double Price_per_unit(){
        return price_per_unit;
    }
}
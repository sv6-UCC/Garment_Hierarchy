/**
 * Class for Polyester with its specific price per unit (5.0)
 *
 * @author Sean Vaughan (ID 119361923)
 */
public final class Polyester extends Synthetic_Fabric{
    private static final String NAME = "polyester";
    private static final Double PRICE_PER_UNIT = 5.0;
    private Double price_per_unit;

    /**
     * Construct an instance of this class with it's name (polyester) to be used in the super class Synthetic_Fabric.
     */
    public Polyester(){
        super(NAME);
        price_per_unit=PRICE_PER_UNIT;
    }

    /**
     * Get the price per unit of Polyester
     *
     * @return The price per unit of Polyester
     */
    @Override
    public Double Price_per_unit(){
        return price_per_unit;
    }
}

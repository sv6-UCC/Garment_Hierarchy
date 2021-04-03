/**
 * Class for Cotton with its specific price per unit (2.0),
 * and source of garment of Cotton (gossypium)
 * @author Sean Vaughan (ID 119361923)
 */

public final class Cotton extends Natural_Fabric{
    private static final String NAME = "cotton";
    private static final String SOURCE_OF_GARMENT = "gossypium";
    private String source_of_garment;
    public static final Double PRICE_PER_UNIT = 2.0;
    private Double price_per_unit;

    /**
     * Construct an instance of this class with it's name (cotton) to be used in the super class Natural_Fabric.
     */
    public Cotton(){
        super(NAME);
        source_of_garment =SOURCE_OF_GARMENT;
        price_per_unit=PRICE_PER_UNIT;
    }

    /**
     * Get the source of garment of Cotton
     *
     * @return The source of garment of Cotton
     */
    @Override
    public String getSource(){
        return source_of_garment;
    }

    /**
     * Get the price per unit of Cotton
     *
     * @return The price per unit of Cotton
     */
    @Override
    public Double Price_per_unit(){
        return price_per_unit;
    }
}

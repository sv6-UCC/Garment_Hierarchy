/**
 * Class for Tweed with its specific price per unit (3.0),
 * and source of garment of Tweed (wool)
 * @author Sean Vaughan (ID 119361923)
 */
public final class Tweed extends Natural_Fabric{
    private static final String NAME = "tweed";
    private static final String SOURCE_OF_GARMENT = "wool";
    private String source_of_garment;
    private static final Double PRICE_PER_UNIT = 3.0;
    private Double price_per_unit;

    /**
     * Construct an instance of this class with it's name (tweed) to be used in the super class Natural_Fabric.
     */
    public Tweed(){
        super(NAME);
        this.source_of_garment =SOURCE_OF_GARMENT;
        this.price_per_unit=PRICE_PER_UNIT;
    }

    /**
     * Get the source of garment of Tweed
     *
     * @return The source of garment of Tweed
     */
    @Override
    public String getSource(){
        return source_of_garment;
    }

    /**
     * Get the Price per unit of Tweed
     *
     * @return The Price per unit of Tweed
     */
    @Override
    public Double Price_per_unit(){
        return price_per_unit;
    }
}

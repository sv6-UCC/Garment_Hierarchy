/**
 * Class for T_Shirt with it's specific fabric the garment is made of (cotton)
 * and the number of units needed for this fabric (1.5).
 * @author Sean Vaughan (ID 119361923)
 */
public final class T_Shirt extends Garment {
    private static final String NAME = "t-shirt";
    private final static Double NO_OF_UNITS = 1.5;
    private Double no_of_units;
    private final static String FABRIC_NAME = "cotton";
    private static String fabric_name;
    private final static String GARMENT_TYPE = "shirts";
    private String garment_type;

    /**
     * Construct an instance of this class with it's name (t-shirt) to be used in the super class Garment.
     */
    public T_Shirt() {
        super(NAME);
        no_of_units=NO_OF_UNITS;
        fabric_name=FABRIC_NAME;
        garment_type=GARMENT_TYPE;
    }

    /**
     * Overrides the No_of_units() method in the Garment class and gets the number of units
     * of fabric to produce the T_Shirt garment.
     *
     * @return The number of units of fabric for T_Shirt.
     */
    @Override
    public Double No_of_units(){
        return no_of_units;
    }

    /**
     * Overrides the Fabric_name() method in the Garment class and gets name of the fabric
     * needed to produce the T_Shirt garment.
     *
     * @return The name of the fabric that is used for T_Shirt.
     */
    @Override
    public String Fabric_name(){
        return fabric_name;
    }

    /**
     * Get the type of the garment which is shirts for the T_Shirt class
     *
     * @return The type of the garment
     */
    @Override
    public String getGarment_type() {
        return garment_type;
    }
}

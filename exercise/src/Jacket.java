/**
 * Class for Jacket with it's specific fabric the garment is made of (tweed)
 * and the number of units needed for this fabric (2.0).
 * @author Sean Vaughan (ID 119361923)
 */
public final class Jacket extends Garment {
    private static final String NAME = "jacket";
    private final static Double NO_OF_UNITS = 2.0;
    private Double no_of_units;
    private final static String FABRIC_NAME = "tweed";
    private static String fabric_name;
    private final static String GARMENT_TYPE = "coats";
    private String garment_type;

    /**
     * Construct an instance of this class with it's name (Jacket) to be used in the super class Garment.
     */
    public Jacket() {
        super(NAME);
        no_of_units=NO_OF_UNITS;
        fabric_name=FABRIC_NAME;
        garment_type=GARMENT_TYPE;
    }

    /**
     * Overrides the No_of_units() method in the Garment class and gets the number of units
     * of fabric to produce the Jacket garment.
     *
     * @return The number of units of fabric for Jacket.
     */
    @Override
    public Double No_of_units(){
        return no_of_units;
    }

    /**
     * Overrides the Fabric_name() method in the Garment class and gets name of the fabric
     * needed to produce the Jacket garment.
     *
     * @return The name of the fabric that is used for Jacket.
     */
    @Override
    public String Fabric_name(){
        return fabric_name;
    }

    /**
     * Get the type of the garment which is coats for the Jacket class
     *
     * @return The type of the garment
     */

    @Override
    public String getGarment_type() {
        return garment_type;
    }
}

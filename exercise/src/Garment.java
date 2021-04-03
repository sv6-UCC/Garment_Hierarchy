/**
 * Class for Garment with methods to find the name,number of units,fabric name,
 * purpose and an itemised bill of the garment.
 * @author Sean Vaughan (ID 119361923)
 */

import java.util.Arrays;
import java.util.List;

public class Garment {
    private static List<String> natural_fabric_list = Arrays.asList("cotton","tweed");
    private static List<String> synthetic_fabric_list = Arrays.asList("polyester","acrylic");
    private static List<String> trousers = Arrays.asList("jeans");
    private static List<String> shirts = Arrays.asList("t-shirt");
    private static List<String> coats = Arrays.asList("winter coat","rain coat","jacket");
    private final static String FABRIC_NAME = "";
    private String fabric_name;
    private final static String GARMENT_TYPE = "";
    private String garment_type;
    private String name;
    private final Double NO_OF_UNITS = 0.0;
    private Double no_of_units;

    /**
     * Construct an instance of this class with a given name
     *
     * @param name The name of the garment.
     */

    public Garment(final String name){
        this.name=name;
        no_of_units=NO_OF_UNITS;
        fabric_name=FABRIC_NAME;
        garment_type=GARMENT_TYPE;
    }
    /**
     * Get the name of this garment.
     *
     * @return The name of this garment.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the name of the fabric in the garment.
     *
     * @return The name of this fabric.
     */
    public String Fabric_name() {
        return fabric_name;
    }
    /**
     * Get the number of units of fabric to produce the garment.
     *
     * @return The number of units of fabric.
     */
    public Double No_of_units( ) {
        return no_of_units;
    }
    /**
     * Get the type of the garment whether the type is trousers, shirt or a coat.
     *
     * @return The type of the garment
     */
    public String getGarment_type( ) {
        return garment_type;
    }

    /**
     * Get the purpose of the garment whether the purpose is for trousers, shirt or a coat.
     *
     * Prints The purpose of the fabric and what other garments of that type are available.
     */
    public void printPurpose( ) {
        if (getGarment_type().equals("trousers")) {
            System.out.println( "Cover the Legs;The only trousers at the moment are " + trousers);
        }
        else if (getGarment_type().equals("shirts")) {
            System.out.println( "Cover the body. The only shirt at the moment is a "+ shirts);
        }
        else if (getGarment_type().equals("coats")) {
            System.out.println( "Provide extra protection against the elements. " +
                    "The only coats at the moment are: "+ coats);
        }
    }

    /**
     * Get the itemised bill of the garment which includes its environment tax, base price and grand total
     *
     * Prints The full itemised bill of the garment
     */
    public void printItemisedBill( ){
        if (natural_fabric_list.contains(Fabric_name())){ // If the fabric is a natural fabric
            Natural_Fabric natural_fabric = new Natural_Fabric(Fabric_name());
            //Create a natural fabric object and use it's methods for the bill (composition)
            System.out.println("Itemised bill for " + getName());
            System.out.println("Made of " + No_of_units() + " units of " + Fabric_name()
                    + " of "+natural_fabric.getSource());
            System.out.println("environment tax: " + No_of_units() + " * " + natural_fabric.getEnvironment_tax()
                    + " = " + No_of_units() * natural_fabric.getEnvironment_tax());
            System.out.println("base price: " + No_of_units() + " * " + natural_fabric.Price_per_unit()
                    + " = " + No_of_units() * natural_fabric.Price_per_unit());
            System.out.println("grand total: " + No_of_units() + " * " + natural_fabric.Price_per_unit()
                    + " = " + No_of_units() * natural_fabric.Price_per_unit());

            }

        else if (synthetic_fabric_list.contains(Fabric_name())){ // If the fabric is a synthetic fabric
            Synthetic_Fabric synthetic_fabric = new Synthetic_Fabric(Fabric_name()); //Create a synthetic fabric object
            System.out.println("Itemised bill for " + getName());
            System.out.println("Made of " + No_of_units() + " units of " + Fabric_name());
            System.out.println("environment tax: " + No_of_units() + " * " + synthetic_fabric.getEnvironment_tax()
                    + " = " + No_of_units() * synthetic_fabric.getEnvironment_tax());
            System.out.println("base price: (" + synthetic_fabric.Price_per_unit() + " +"
                    + synthetic_fabric.getEnvironment_tax() + " )* " + No_of_units() + " = "
                    + (synthetic_fabric.Price_per_unit() + synthetic_fabric.getEnvironment_tax()) * No_of_units());
            System.out.println("grand total: (" + synthetic_fabric.Price_per_unit() + " +"
                    + synthetic_fabric.getEnvironment_tax() + " )* " + No_of_units() + " = "
                    + (synthetic_fabric.Price_per_unit() + synthetic_fabric.getEnvironment_tax()) * No_of_units());


        }

    }

    /**
     * The string method for the garment which is the name of the garment
     *
     * @return The name of the garment
     */
    @Override
    public String toString( ) {
        return getName( );
    }
}

/**
 * Class for Natural Fabric with methods to find the name,price per unit,
 * environment tax and source of the Natural fabric.
 * @author Sean Vaughan (ID 119361923)
 */
public class Natural_Fabric extends Fabric{

    private static final String SOURCE_OF_GARMENT = "";
    private static final Double PRICE_PER_UNIT = 0.0;
    private Double price_per_unit;
    private String source_of_garment;
    private String name;

    /**
     * Construct an instance of this class with a given name
     *
     * @param name The name of the garment.
     */
    public Natural_Fabric(final String name) {
        super(name);
        price_per_unit=PRICE_PER_UNIT;
        source_of_garment =SOURCE_OF_GARMENT;
        this.name =name;
    }

    /**
     * Get the source of garment of this fabric by checking the name of the Natural Fabric
     *
     * The Natural Fabric name's get source of garment method
     */
    public String getSource() {
        if (getName().equals("cotton")) {
            Cotton cotton =new Cotton();
            return cotton.getSource();
        }
        else if (getName().equals("tweed")) {
            Tweed tweed =new Tweed();
            return tweed.getSource();
        }
        else {
            return source_of_garment;
        }
    }

    /**
     * Get the price per unit of this fabric by checking the name of the Natural Fabric
     *
     * @return The Natural Fabric name's price per unit method
     */
    @Override
    public Double Price_per_unit(){
        if (getName().equals("cotton")) {
            Cotton cotton =new Cotton();
            return cotton.Price_per_unit();
        }
        else if (getName().equals("tweed")){
            Tweed tweed = new Tweed();
            return tweed.Price_per_unit();
        }
        else {
            return price_per_unit;
        }
    }
}

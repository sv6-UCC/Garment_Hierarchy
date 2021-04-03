/**
 * Class for Synthetic Fabric with methods to find the name,price per unit,
 * and environment tax of the synthetic fabric
 * @author Sean Vaughan (ID 119361923)
 */
public class Synthetic_Fabric extends Fabric{
    private final static Double ENVIRONMENT_TAX =2.0;
    private final static Double PRICE_PER_UNIT = 0.0;
    private Double price_per_unit;
    private String name;
    private Double environment_tax;

    /**
     * Construct an instance of this class with a given name
     *
     * @param name The name of the synthetic fabric.
     */
    public Synthetic_Fabric(final String name) {
        super(name);
        this.name =name;
        price_per_unit=PRICE_PER_UNIT;
        environment_tax=ENVIRONMENT_TAX;
    }

    /**
     * Get the price per unit of this fabric by checking the name of the Synthetic Fabric
     *
     * @return The Synthetic Fabric name's price per unit method
     */
    @Override
    public Double Price_per_unit(){
        if (getName().equals("acrylic")) {
            Acrylic acrylic = new Acrylic();
            return acrylic.Price_per_unit();
        }
        else if (getName().equals("polyester")){
            Polyester polyester= new Polyester();
            return polyester.Price_per_unit();
        }
        else {
            return price_per_unit;
        }
    }

    /**
     * Gets the environment tax of synthetic fabric
     *
     * @return The environment tax of synthetic fabric.
     */
    @Override
    public Double getEnvironment_tax() {
        return environment_tax;
    }

}

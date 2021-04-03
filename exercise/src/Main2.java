import java.util.List;
import java.util.ArrayList;

public class Main2 {
    public static void main( final String[] args ) {
        final List<Garment> items = new ArrayList<Garment>( );
        final List<Fabric> johnny = new ArrayList<Fabric>( );
        items.add(new Jeans());
        //johnny.add(new Fabric("t-shirt"));

        for (Garment item : items) {
            item.printPurpose( );
            //System.out.println(item);
            //System.out.println(item);
            //System.out.println(item.getName());
            item.printItemisedBill();
        }

        System.out.println( );
    }
}


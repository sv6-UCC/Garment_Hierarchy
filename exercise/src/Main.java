import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main( final String[] args ) {
        final List<Garment> items = new ArrayList<Garment>( );
        final List<Garment> more_items = new ArrayList<Garment>( );
        items.add(new Jeans());
        items.add(new Rain_coat());
        more_items.add(new Jacket());
        more_items.add(new T_Shirt());
        more_items.add(new Winter_coat());

        for (Garment item : items) {
            System.out.println(item.getName());
            item.printPurpose( );
            item.printItemisedBill();
            System.out.println( );
        }

        for (Garment another_item : more_items) {
            System.out.println(another_item);
            another_item.printPurpose( );
            another_item.printItemisedBill();
            System.out.println( );
        }
    }
}

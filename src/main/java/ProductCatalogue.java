import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/**
 * Created by mayan on 2/9/17.
 */
public class ProductCatalogue implements Iterable<Product>{

    private final Set<Product> products =new HashSet<>();
    private  final Set<Product> productsTreeSet = new TreeSet<>(Product.BY_NAME);

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}

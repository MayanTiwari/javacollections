package roughWork;

import java.util.*;


/**
 * Created by mayan on 2/9/17.
 */
public class ProductCatalogue implements Iterable<Product>{

    private final Set<Product> products =new HashSet<>();
    private  final Set<Product> productsTreeSet = new TreeSet<>(Product.BY_NAME);
    private final SortedSet<Product> sortedSet = new TreeSet<>();

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> heavyVanProducts(){
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return sortedSet.headSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        return sortedSet.stream()
                .filter(p -> p.getWeight() > 20)
                .findFirst()
                .orElse(sortedSet.last());
    }

    public Set<Product> lightVanProducts(){
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return sortedSet.tailSet(heaviestLightVanProduct);
    }
}

package roughWork;

import java.util.Comparator;

/**
 * Created by mayan on 26/8/17.
 */
public class ProductComparator implements Comparator<Product>{

    public int compare(Product product, Product t1) {
        if(product.getWeight() > t1.getWeight()) return 1;
        else return 0;
    }
}

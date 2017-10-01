package roughWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mayan on 1/10/17.
 */
public class CollectionUtilities {
    public static void main(String[] args){
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass Window",10);
        List<Product> productList = new ArrayList<Product>();
        Collections.addAll(productList,door,floorPanel,window);
        System.out.println(productList);

        final Product product = Collections.max(productList,Product.BY_NAME);
        System.out.println(product);
    }
}

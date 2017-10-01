package roughWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by mayan on 1/10/17.
 */
public class CollectionOps {
    public static void main(String[] args ){
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass Window",10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
        Collections.shuffle(products);
        Collections.sort(products,Product.BY_Weight);

    }
}

package roughWork;

import java.util.*;

/**
 * Created by mayan on 19/8/17.
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("Hello Main");
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass Window",10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
       // System.out.println(products);
     /*   Iterator<roughWork.Product> productIterator = products.iterator();
        while(productIterator.hasNext()){
            roughWork.Product product  = productIterator.next();
            System.out.println(product);
        }
        for (roughWork.Product p : products){

            System.out.println(p);
        }*/
        //What you can do with only iterator and not with for each
        //You can easily remove product from the list .
        Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()){
            Product product  = productIterator.next();
            if(product.weight > 20){
                System.out.println(product);
            }else{
                productIterator.remove();
            }
        }
        //Collections.sort(products,new roughWork.ProductComparator());
        List<Product> proList = new ArrayList<>();
        //Java 8 method to use comparator.
        proList.sort(Product.BY_Weight);
        //Collections way.
        Collections.sort(proList,Product.BY_Weight);

    }
}

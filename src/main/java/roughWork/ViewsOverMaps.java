package roughWork;

import java.util.*;

/**
 * Created by mayan on 17/9/17.
 */
public class ViewsOverMaps {
    public static void main(String[] args){
        final Map<Integer,Product> idToProduct = new HashMap<>();
        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        System.out.println(idToProduct);

       /* final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        ids.remove(1);
        System.out.println(ids);
        //ids.add(5); Cannot add ids .

        final Collection<Product> products = idToProduct.values();
        System.out.println(products);
        final Set<Map.Entry<Integer,Product>> entries = idToProduct.entrySet();
        for(Map.Entry<Integer,Product> entry: entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
     /*  final Product defaultProduct = new Product("default product",-1);
       Product product = idToProduct.getOrDefault(10,defaultProduct);
       Product result = idToProduct.replace(1,new Product("Big Door",50));

       idToProduct.replaceAll((id,oldProduct) ->
        new Product(oldProduct.getName(),oldProduct.getWeight()+10));*/

       idToProduct.forEach((key,value) ->
       {
            System.out.println(key + "and" + value);
       });

     }
}

package roughWork;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

/**
 * Created by mayan on 19/8/17.
 */
public class Product {

    public String name;
    public int weight;
    public int id;

   // public static final Comparator<roughWork.Product> BY_Weight = comparing(roughWork.Product::getWeight);
    public static final Comparator<Product> BY_Weight = new Comparator<Product>() {
       @Override
       public int compare(Product product, Product t1) {
           return Integer.compare(product.getWeight(),t1.getWeight());
       }
   };
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Product(String name,int weight){
        setName(name);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        //return name != null ? name.equals(product.name) : product.name == null;
        return Objects.equals(name,product.name);
    }

    @Override
    public int hashCode() {
        /*int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;*/
        return Objects.hash(name,weight);
    }
}

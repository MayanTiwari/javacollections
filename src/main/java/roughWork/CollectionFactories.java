package roughWork;

import java.util.Collections;
import java.util.List;

/**
 * Created by mayan on 1/10/17.
 */
public class CollectionFactories {
    public static void main(String[] args){
        //Returns immutable collection .
        List<String> list = Collections.emptyList();
        List<String> singleTon = Collections.singletonList("one");
       // singleTon.add("a");
       // list.add("a");
        System.out.println(list);
        System.out.println(singleTon);
    }

}

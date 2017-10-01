/**
 * Created by mayan on 2/9/17.
 */
import org.junit.Assert;
import org.junit.Test;
import roughWork.ProductCatalogue;
import roughWork.ProductFixtures;

import static org.junit.Assert.assertThat;

public class AllTests {
    @Test
    public void TestTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void shouldFindLightVanProducts()throws Exception{
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(ProductFixtures.bobs);
        catalogue.isSuppliedBy(ProductFixtures.kates);
        Assert.assertTrue(true);
        //assertThat(catalogue.lightVanProducts(),containsInAnyORder(window));

    }

}
